package com.example.myscope;

import javax.inject.Singleton;

import dagger.Component;

/**
 * @author AlexisYin
 */
@MyScope
@Component(modules = NetModule.class)
public interface ApplicationComponent {
    void inject(MainActivity mainActivity);
}
