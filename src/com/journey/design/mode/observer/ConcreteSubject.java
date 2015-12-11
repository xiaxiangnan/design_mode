package com.journey.design.mode.observer;

import java.util.Vector;

/**
 * PROJECT: design_mode
 * Created by xiaxiangnan on 15-10-28.
 */
public class ConcreteSubject implements ISubject {

    Vector<IObserver> observers = new Vector<IObserver>();

    @Override
    public void attach(IObserver observer) {
        observers.add(observer);
    }

    @Override
    public void detach(IObserver observer) {
        observers.removeElement(observer);
    }

    @Override
    public void inform() {
        IObserver.Event evt = new IObserver.Event();
        for(IObserver ob: observers) {
            ob.update(evt); //通知观察者
        }

    }
}
