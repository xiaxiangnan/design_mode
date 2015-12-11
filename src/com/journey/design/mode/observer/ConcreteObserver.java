package com.journey.design.mode.observer;

/**
 * PROJECT: design_mode
 * Created by xiaxiangnan on 15-10-28.
 */
public class ConcreteObserver implements IObserver{
    @Override
    public void update(Event evt) {
        System.out.println("observer receives information");
    }
}
