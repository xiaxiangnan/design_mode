package com.journey.design.mode.proxy.cglib;

import net.sf.cglib.proxy.Callback;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.NoOp;

/**
 * PROJECT: design_mode
 * Created by xiaxiangnan on 15-10-29.
 */
public class BookServiceFactory {

    private static BookServiceBean service = new BookServiceBean();

    private BookServiceFactory() {
    }

    public static BookServiceBean getInstance() {
        return service;
    }


    public static BookServiceBean getProxyInstance(MyCglibProxy myProxy){
        Enhancer en = new Enhancer();
        //进行代理
        en.setSuperclass(BookServiceBean.class);
        en.setCallback(myProxy);
        //生成代理实例
        return (BookServiceBean)en.create();
    }

    public static BookServiceBean getProxyInstanceByFilter(MyCglibProxy myProxy){
        Enhancer en = new Enhancer();
        en.setSuperclass(BookServiceBean.class);
        /*
         * setCallbacks中定义了所使用的拦截器，其中NoOp.INSTANCE是CGlib所提供的实际是一个没有任何操作的拦截器
         * 他们是有序的,一定要和CallbackFilter里面的顺序一致，上面return返回(0/1)的就是返回的顺序。
         * 也就是说如果调用query方法return 1 就使用NoOp.INSTANCE进行拦截。
         * 非query方法 return 0 就是用myProxy进行拦截
         */
        en.setCallbacks(new Callback[]{myProxy, NoOp.INSTANCE});//设置两个方法拦截器
        en.setCallbackFilter(new MyProxyFilter());
        return (BookServiceBean)en.create();
    }

}