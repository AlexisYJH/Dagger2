package com.example.subcomponent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    /**
     * 模块和组件不加作用域，user != user2 != user3
     * 加作用域，且子组件不和Application绑定时，生命周期同Activity，user == user2 != user3（常见，主组件和子组件不同生命周期）
     * 加作用域，且子组件和Application绑定时，生命周期同Application，user == user2 == user3 （主组件和子组件生命周期一致，没必要创建子组件）
      */
    @Inject
    User user, user2;

    @Inject
    ApiService apiService, apiService2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //5. 执行注入
        MyApplication.getApplicationComponent().userComponent().create().inject(this);
        //同主组件一样成为全局单例
        //MyApplication.getUserComponent().inject(this);
        Log.d("TAG", "onCreate user: " + user + ", user2: " + user2);
        Log.d("TAG", "apiService: " + apiService + ", apiService2: " + apiService2);
        startActivity(new Intent(this, SecondActivity.class));
    }
}