package com.example.scope;

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
    ApiService apiService3;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //局部单例
        //DaggerApplicationComponent.create().inject(this);
        //全局单例
        MyApplication.getApplicationComponent().inject(this);

        //注意@Singleton作用域不等于单例，而是同组件生命周期一致
        //这里两个Activity用到的组件对象不是同一个
        Log.d("TAG_2", "apiService3: " + apiService3);
    }
}
