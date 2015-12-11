package com.journey.design.mode.observer;


/**
 * 观察者接口
 * PROJECT: design_mode
 * Created by xiaxiangnan on 15-10-22.
 */
public interface IObserver {

    public static class Event{

    }

    void update(Event evt); //更新观察者

}
