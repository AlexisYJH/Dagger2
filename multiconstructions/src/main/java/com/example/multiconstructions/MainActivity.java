package com.example.multiconstructions;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import javax.inject.Inject;
import javax.inject.Named;

public class MainActivity extends AppCompatActivity {

    //@Named("user1")
    @UserQualifier1
    @Inject
    User user1;

    //@Named("user2")
    @UserQualifier2
    @Inject
    User user2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DaggerApplicationComponent.create().inject(this);
        Log.d("TAG", "user1: " + user1.getName() + ", user2: " + user2.getName());
    }
}