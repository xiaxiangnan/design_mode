package com.journey.design.mode.singleton;

/**
 * 内部类实现，延迟加载和线程安全，低延迟
 * PROJECT: design_mode
 * Created by xiaxiangnan on 15-8-21.
 */
public class StaticSingleton {

    private StaticSingleton() {
        System.out.println("StaticSingleton is create");
    }

    private static class SingletonHolder {
        private static StaticSingleton instance = new StaticSingleton();
    }

    /**
     * 类加载本身是线程安全的
     * @return
     */
    public static StaticSingleton getInstance() {
        return SingletonHolder.instance;
    }

}
