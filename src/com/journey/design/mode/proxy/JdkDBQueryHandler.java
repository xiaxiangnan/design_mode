package com.journey.design.mode.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * jdk自带的动态代理。此外CGLIB，Javassist高阶的字节码生成库，性能好功能强大
 * PROJECT: design_mode
 * Created by xiaxiangnan on 15-9-22.
 */
public class JdkDBQueryHandler implements InvocationHandler {

    private DBQuery real = null;

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //真正需要的时候才创建，创建时间可能很慢
        if (real == null) {
            real = new DBQuery();
        }

        return real.request();
    }

    public static IDBQuery createJdkProxy() {
        IDBQuery jdkProxy = (IDBQuery) Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(), new Class[]{IDBQuery.class}, new JdkDBQueryHandler());
        return  jdkProxy;
    }

}
