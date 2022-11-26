package com.example.manualioc;

/**
 * @author AlexisYin
 */
//IOC框架，两种实现
// - 基于反射的实现，Spring IOC（动态地进行依赖关系的建立）
// - 静态方法，程序在编译时就已经提供了建立依赖关系的类。（Dagger2）
//Dagger提供给Android快速实现依赖注入的框架，1.0由Square开发，由Google接收并维护2.0以上版本
public class Injector {

    public void inject(Car car) {
        Engine engine = new Engine();
        car.setEngine(engine);
    }
}
