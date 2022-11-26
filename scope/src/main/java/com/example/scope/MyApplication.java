package com.example.scope;

import android.app.Application;

/**
 * @author AlexisYin
 */
public class MyApplication extends Application {
    private static ApplicationComponent applicationComponent = DaggerApplicationComponent.create();

    public static ApplicationComponent getApplicationComponent() {
        return applicationComponent;
    }
}
