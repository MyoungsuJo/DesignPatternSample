package com.myoungsujo.designpatternsample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.myoungsujo.designpatternsample.builder.BuilderPattern;

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

        // 3. Factory Method

        // 4. Facade

        // 5. Chain of Responsibility

        // 6. Prototype

        // 7. Template Method

        // 8. Visitor

        // 9. Strategy

        // 10. Composite

        // 11. Decorator

        // 12. FlyWeight

        // 13. Mediator
    }
}
