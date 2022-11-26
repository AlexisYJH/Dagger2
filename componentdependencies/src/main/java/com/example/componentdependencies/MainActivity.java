package com.example.componentdependencies;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

import javax.inject.Inject;

import retrofit2.Retrofit;

public class MainActivity extends AppCompatActivity {
    @Inject
    User user, user2;

    @Inject
    Retrofit retrofit;

    @Inject
    ApiService apiService, apiService2;

    @Inject
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //MyApplication.getApplicationComponent().inject(this);

        //4. 执行注入，DaggerUserComponent只有builder方法，没有create方法，必须指定依赖组件
        DaggerUserComponent.builder().applicationComponent(MyApplication.getApplicationComponent()).build().inject(this);

        Log.d("TAG", "onCreate user: " + user + ", user2: " + user2);
        Log.d("TAG", "retrofit: " + retrofit);
        Log.d("TAG", "apiService: " + apiService + ", apiService2: " + apiService2);
        Log.d("TAG", "context: " + context);
    }
}