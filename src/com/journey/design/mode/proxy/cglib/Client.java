package com.journey.design.mode.proxy.cglib;

/**
 * PROJECT: design_mode
 * Created by xiaxiangnan on 15-10-29.
 */
public class Client {

    public static void main(String[] args) {
        //一般模式
        BookServiceBean service = BookServiceFactory.getInstance();
        doMethod(service);
        System.out.println("--------------service end---------------");

        //动态代理
        BookServiceBean service1 = BookServiceFactory.getProxyInstance(new MyCglibProxy("boss"));
        doMethod(service1);
        System.out.println("--------------service1 end---------------");
        BookServiceBean service2 = BookServiceFactory.getProxyInstance(new MyCglibProxy("john"));
        doMethod(service2);
        System.out.println("--------------service2 end---------------");

        BookServiceBean service3 = BookServiceFactory.getProxyInstanceByFilter(new MyCglibProxy("boss"));
        doMethod(service3);
        System.out.println("--------------service3 end---------------");
        BookServiceBean service4 = BookServiceFactory.getProxyInstanceByFilter(new MyCglibProxy("john"));
        doMethod(service4);
        System.out.println("--------------service4 end---------------");

    }

    public static void doMethod(BookServiceBean service) {
//        service.create();
//        service.update();
        service.query();
        service.delete();
    }
}