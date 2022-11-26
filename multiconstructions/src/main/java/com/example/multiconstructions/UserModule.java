package com.example.multiconstructions;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * @author AlexisYin
 */
//1. 新建模块
@Module
public class UserModule {

    //@Named("user1")
    @UserQualifier1
    @Provides
    User provideUser() {
        return new User();
    }

    //@Named("user2")
    @UserQualifier2
    @Provides
    User provideUser2() {
        return new User("Alexis");
    }
}
