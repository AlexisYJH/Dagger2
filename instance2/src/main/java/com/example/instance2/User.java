package com.example.instance2;

import javax.inject.Inject;

/**
 * @author AlexisYin
 */
public class User {
    //0. 添加依赖
    //1. 方式一：在构造方法上使用@Inject注解，即告知Dagger可以通过构造方法来创建并获取到User实例
    //1. 方式二：使用@Module声明一个类为Dagger模块，并提供创建某个对象实例的方法，然后使用@Provides或@Binds注解该方法

    //@Inject
    public User() {
    }
}
