package com.myoungsujo.designpatternsample.templete;

import android.util.Log;

/**
 * 해당 클래스 변경이 발생시 sub 클래스들도 전부 바뀔수 있음에 주의~
 *
 * Created by user4 on 2017-05-18.
 */

public abstract class AbstractTemplateMethod {

    abstract public String toString();


    public void doThat(){

        // 다른 코드들은 여기서 호출~
        String str = toString();


        // 공통의 코드는 여기
        Log.d(TAG, "AbstractTemplateMethod doThat : " + str);

    }

    private static final String TAG = "AbstractTemplateMethod";

}
