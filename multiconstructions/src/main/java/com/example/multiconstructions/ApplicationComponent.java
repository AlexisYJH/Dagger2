package com.example.multiconstructions;

import dagger.Component;

/**
 * @author AlexisYin
 */
@Component(modules = UserModule.class)
public interface ApplicationComponent {
    void inject(MainActivity mainActivity);
}
