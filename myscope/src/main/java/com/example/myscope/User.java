package com.example.myscope;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * @author AlexisYin
 */

// 此时如果使用@Singleton注解，编译报错，因为User和Component作用域不一样
// Component作为IOC容器，容器中获取实例的地方只要用到了作用域，那么作用域必须和容器保持一致
// 所以容器内的实例要么没有使用作用域，要么作用域和组件一致
@MyScope
public class User {

    @Inject
    public User() {
    }
}
