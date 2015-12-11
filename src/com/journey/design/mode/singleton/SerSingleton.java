package com.journey.design.mode.singleton;

import java.io.Serializable;

/**
 * 防止序列化（ObjectInputStream.readObject）
 * 通过getInstance方法获得的那个单例对象序列化后再从内存中读出时, 就有一个全新的,
 * 当JVM从内存中反序列化地"组装"一个新对象时,就会自动调用这个 readResolve方法来返回我们指定好的对象了, 单例规则也就得到了保证
 * PROJECT: design_mode
 * Created by xiaxiangnan on 15-8-21.
 */
public class SerSingleton implements Serializable {

    private SerSingleton() {
        System.out.println("SerSingleton is create");
    }

    private static SerSingleton instance = new SerSingleton();

    public static SerSingleton getInstance() {
        return instance;
    }

    /**
     * 在从流中读取类的一个实例时需要指定替代的类应使用的准确签名来实现此特殊方法
     * @return Object
     */
    private Object readResolve() {
        return instance;
    }

}
