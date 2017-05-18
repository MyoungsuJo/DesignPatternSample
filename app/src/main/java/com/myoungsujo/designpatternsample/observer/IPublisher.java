package com.myoungsujo.designpatternsample.observer;

/**
 * Created by user4 on 2017-05-18.
 */

public interface IPublisher {
    public void add(IObserver observer);
    public void delete(IObserver observer);
    public void notifyObserver();
}
