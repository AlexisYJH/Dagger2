package com.example.instance2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import javax.inject.Inject;

import retrofit2.Retrofit;

public class MainActivity extends AppCompatActivity {

    //3. 在注入目标类中声明依赖项，加上@Inject注解
    @Inject
    User user;

    @Inject
    Retrofit retrofit;

    @Inject
    ApiService apiService;

    @Inject
    AInterface aInterface;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //4. 执行注入动作（关键步骤）
        DaggerApplicationComponent.create().inject(this);

        //验证
        Log.d("TAG", "user: " + user);
        Log.d("TAG", "retrofit: " + retrofit);
        Log.d("TAG", "apiService: " + apiService);
        Log.d("TAG", "aInterface: " + aInterface);
    }
}