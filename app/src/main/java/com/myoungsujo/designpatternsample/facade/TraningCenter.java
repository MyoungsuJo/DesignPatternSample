package com.myoungsujo.designpatternsample.facade;

/**
 * Created by user4 on 2017-05-18.
 */

public class TraningCenter {

    private PersonalTraning mPT;
    private Yoga mYoga;
    private Shower mShower;

    public TraningCenter(PersonalTraning pt, Yoga yoga, Shower shower){
        mPT = pt;
        mYoga = yoga;
        mShower = shower;
    }

    public void doPersonalTraning(){
        mPT.doTraining();
        mPT.getAdvice();

        mShower.doShower();
    }

    public void doYoga(){
        mYoga.doStretching();
        mYoga.doJimBall();

        mShower.doShower();
    }

}
