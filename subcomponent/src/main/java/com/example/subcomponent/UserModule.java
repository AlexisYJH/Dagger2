package com.example.subcomponent;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * @author AlexisYin
 */
//1. 新建模块
@Module
public class UserModule {
    @Singleton
    @Provides
    User provideUser() {
        return new User();
    }
}
