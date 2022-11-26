package com.example.subcomponent;

import android.app.Application;

/**
 * @author AlexisYin
 */
public class MyApplication extends Application {
    private static ApplicationComponent applicationComponent = DaggerApplicationComponent.builder().build();
    //private static UserComponent userComponent = applicationComponent.userComponent().create();

    public static ApplicationComponent getApplicationComponent() {
        return applicationComponent;
    }

    /*public static UserComponent getUserComponent() {
        return userComponent;
    }*/
}
