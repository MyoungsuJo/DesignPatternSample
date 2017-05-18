package com.myoungsujo.designpatternsample.observer;

import android.util.Log;

/**
 * Created by user4 on 2017-05-18.
 */

public class ObserverPattern implements IObserver {

    private IPublisher mIPublisher;

    public ObserverPattern(IPublisher p){
        mIPublisher = p;

        mIPublisher.add(this);
    }


    @Override
    public void update(String msg, String data) {

        Log.d(TAG, "update msg : " + msg + ", data : " + data);

        // update 로 결과를 수신 받고 난 다음 자기자신을 삭제
        mIPublisher.delete(this);
    }

    private static final String TAG = "ObserverPattern";
}
