package com.myoungsujo.designpatternsample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.myoungsujo.designpatternsample.builder.BuilderPattern;
import com.myoungsujo.designpatternsample.facade.PersonalTraning;
import com.myoungsujo.designpatternsample.facade.Shower;
import com.myoungsujo.designpatternsample.facade.TraningCenter;
import com.myoungsujo.designpatternsample.facade.Yoga;
import com.myoungsujo.designpatternsample.observer.ObserverPattern;
import com.myoungsujo.designpatternsample.observer.ObserverPatternPublisher;
import com.myoungsujo.designpatternsample.templete.AbstractTemplateMethod;
import com.myoungsujo.designpatternsample.templete.TemplateMethod;
import com.myoungsujo.designpatternsample.templete.TemplateMethod2;

// 패턴 테스트용 액티비티
// 차후 프로젝트에 패턴적용시 쉽게 하려고?!
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 1. Builder
        BuilderPattern builderPattern = new BuilderPattern.Builder("a","b","c").build();
        // 2. Observer
        ObserverPatternPublisher publisher = new ObserverPatternPublisher();
        ObserverPattern observerPattern = new ObserverPattern(publisher);

        publisher.doPublishing();
        // 3. Factory Method

        // 4. Facade
        PersonalTraning pt = new PersonalTraning();
        Yoga yoga = new Yoga();
        Shower shower = new Shower();

        TraningCenter traningCenter = new TraningCenter(pt,yoga,shower);
        traningCenter.doPersonalTraning();
        // 5. Chain of Responsibility

        // 6. Prototype

        // 7. Template Method
        AbstractTemplateMethod templateMethod = new TemplateMethod();
        templateMethod.doThat();

        AbstractTemplateMethod templateMethod2 = new TemplateMethod2();
        templateMethod2.doThat();

        // 8. Visitor

        // 9. Strategy

        // 10. Composite

        // 11. Decorator

        // 12. FlyWeight

        // 13. Mediator
    }
}
