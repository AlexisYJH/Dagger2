package com.example.instance1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    //3. 在注入目标类中声明依赖项，加上@Inject注解
    @Inject
    User user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //4. 执行注入动作（关键步骤）
        // 先编译，会生成ApplicationComponent的实现类DaggerApplicationComponent（在预编译时生成一些类）
        DaggerApplicationComponent.create().inject(this);
        Log.d("TAG", "user: " + user);
    }
}