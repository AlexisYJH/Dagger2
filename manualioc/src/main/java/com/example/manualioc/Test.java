package com.example.manualioc;

/**
 * @author AlexisYin
 */
public class Test {
    public static void main(String[] args) {
        //Car的依赖项Engine，Engine的依赖项Cylinder
        //如果有多个依赖项，或者依赖项也有其依赖项，手动依赖注入则太麻烦，需要借助IOC框架来完成自动注入
        Engine engine = new Engine();
        Car car = new Car(engine);
        //car.setEngine(engine);
        car.start();
    }
}
