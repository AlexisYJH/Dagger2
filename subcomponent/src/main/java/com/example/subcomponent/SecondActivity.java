package com.example.subcomponent;

import android.os.Bundle;
import android.util.Log;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import javax.inject.Inject;

/**
 * @author AlexisYin
 */
public class SecondActivity extends AppCompatActivity {
    @Inject
    User user3;

    @Inject
    ApiService apiService3;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        MyApplication.getApplicationComponent().userComponent().create().inject(this);
        //同主组件一样成为全局单例
        //MyApplication.getUserComponent().inject(this);
        Log.d("TAG", "user3: " + user3);
        Log.d("TAG", "apiService3: " + apiService3);
    }
}
