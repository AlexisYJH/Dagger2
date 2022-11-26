package com.example.manualioc;

/**
 * @author AlexisYin
 */
public class Car {
    public Engine engine;

    //IOC前
    public void start1() {
        engine = new Engine();
        engine.start();
    }

    //IOC后
    public void start() {
        engine.start();
    }

    /*engine对象不由Car自己创建，从外部传入，对engine进行赋值
    使Car类不再关心Engine的创建：在start方法中如果Engine构造方法发生变化，或者更改一种Engine，start方法都需要修改
    改为依赖注入，Car只需要关注自身业务，不需要关心怎么构建Engine实例，只需要拿到传入的实例进行自己的业务*/

    //依赖注入的两种方式：
    //1. 构造方法注入
    public Car(Engine engine) {
        this.engine = engine;
    }

    //2. Setter注入（字段注入）
    public void setEngine(Engine engine) {
        this.engine = engine;
    }
}
