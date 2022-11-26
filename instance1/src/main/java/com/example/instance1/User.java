package com.example.instance1;

import javax.inject.Inject;

/**
 * @author AlexisYin
 */
public class User {
    //0. 添加依赖
    //1. 在构造方法上使用@Inject注解，即告知Dagger可以通过构造方法来创建并获取到User实例

    @Inject
    public User() {
    }
}
