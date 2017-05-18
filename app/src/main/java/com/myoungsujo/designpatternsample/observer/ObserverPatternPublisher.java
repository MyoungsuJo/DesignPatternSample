package com.myoungsujo.designpatternsample.observer;

import java.util.ArrayList;

/**
 * Created by user4 on 2017-05-18.
 */

public class ObserverPatternPublisher implements IPublisher {

    private ArrayList<IObserver> listObserver;

    public ObserverPatternPublisher(IObserver observer){
        if(listObserver == null) {
            listObserver = new ArrayList<IObserver>();
        }

    }

    @Override
    public void add(IObserver observer) {
        if(listObserver != null) {
            listObserver.add(observer);
        }
    }

    @Override
    public void delete(IObserver observer) {
        if(listObserver != null && listObserver.size() > 0){
            int idx = listObserver.indexOf(observer);
            listObserver.remove(idx);

            // 삭제시 위와 아래의 차이는?
//            listObserver.remove(observer);

        }
    }

    @Override
    public void notifyObserver() {
        if(listObserver != null) {
            for (IObserver o : listObserver) {
                o.update("a", "b", this);
            }
        }
    }
}
