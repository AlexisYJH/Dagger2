package com.example.scope;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {
    @Inject
    User user, user2;

    //作用域在这里实现的是局部单例，即在MainActivity中是单例，本质是同组件生命周期一致
    //要实现全局单例：将组件和Application绑定
    @Inject
    ApiService apiService, apiService2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //4. 执行注入动作（关键步骤）
        //局部单例
        //DaggerApplicationComponent.create().inject(this);
        //全局单例
        MyApplication.getApplicationComponent().inject(this);

        //验证
        Log.d("TAG", "没有使用作用域 user: " + user + ", user2: " + user2);
        Log.d("TAG", "使用作用域（同组件生命周期一致） apiService: " + apiService + ", apiService2: " + apiService2);
        startActivity(new Intent(this, SecondActivity.class));
    }
}