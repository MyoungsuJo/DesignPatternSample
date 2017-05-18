package com.myoungsujo.designpatternsample.observer;

/**
 * Created by user4 on 2017-05-18.
 */

public interface IObserver {
    public void update(final String msg, final String data, IPublisher publisher);
}
