package com.journey.design.mode.singleton;

/**
 * 延迟初始化
 * PROJECT: design_mode
 * Created by xiaxiangnan on 15-8-20.
 */
public class LazySingleton {

    private LazySingleton() {
        System.out.println("LazySingleton is create"); //创建过程可能比较慢
    }

    private static LazySingleton instance = null;

    public static synchronized LazySingleton getInstance() {
        if(instance == null) {
            instance = new LazySingleton();
        }
        return  instance;
    }


}
