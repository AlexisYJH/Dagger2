package com.example.myscope;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    //现在User和Component和Application三者生命周期一致，如果现在要求User和Activity生命周期一致呢？多个组件？组件依赖/子组件
    @Inject
    User user, user2;

    @Inject
    ApiService apiService, apiService2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MyApplication.getApplicationComponent().inject(this);
        Log.d("TAG", "user: " + user + ", user2: " + user2);
        Log.d("TAG", "apiService: " + apiService + ", apiService2: " + apiService2);
    }
}