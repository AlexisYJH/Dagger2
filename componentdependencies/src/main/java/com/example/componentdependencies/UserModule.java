package com.example.componentdependencies;

import dagger.Module;
import dagger.Provides;

/**
 * @author AlexisYin
 */
//1. 新建模块
@Module
public class UserModule {
    @UserScope
    @Provides
    User provideUser() {
        return new User();
    }
}
