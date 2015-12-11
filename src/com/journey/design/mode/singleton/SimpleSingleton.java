package com.journey.design.mode.singleton;

/**
 * 无法对实例延迟加载
 * PROJECT: design_mode
 * Created by xiaxiangnan on 15-8-14.
 */
public class SimpleSingleton {

    private SimpleSingleton() {
        System.out.println("SimpleSingleton is create");
    }

    private static SimpleSingleton singleton = new SimpleSingleton();

    public static SimpleSingleton getInstance() {
        return singleton;
    }

}
