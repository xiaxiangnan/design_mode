package com.journey.design.mode.observer;

/**
 * 主题接口（被观察的对象）
 * PROJECT: design_mode
 * Created by xiaxiangnan on 15-10-22.
 */
public interface ISubject {

    void attach(IObserver observer); //添加观察者
    void detach(IObserver observer); //删除观察者
    void inform(); //通知所有观察者

}
