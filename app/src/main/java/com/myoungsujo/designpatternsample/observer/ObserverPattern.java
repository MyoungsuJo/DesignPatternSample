package com.myoungsujo.designpatternsample.observer;

/**
 * Created by user4 on 2017-05-18.
 */

public class ObserverPattern implements IObserver {

    public ObserverPattern(){
        ObserverPatternPublisher publisher = new ObserverPatternPublisher(this);
    }


    @Override
    public void update(String msg, String data,IPublisher publisher) {

        // update 로 결과를 수신 받고 난 다음 자기자신을 삭제
        publisher.delete(this);
    }
}
