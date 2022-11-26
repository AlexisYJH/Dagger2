package com.example.subcomponent;

import javax.inject.Singleton;

import dagger.Subcomponent;

/**
 * @author AlexisYin
 */
/**
 * 2.1 新建Subcomponent，指定模块
 * 2.2 添加注入方法，去除主模块相同的注入方法
 * 2.3 新建Subcomponent.Factory接口，在主模块增加申明该接口的方法
 */
//6. （可选）给子组件和其模块中的方法添加作用域
@Singleton
@Subcomponent(modules = UserModule.class)
public interface UserComponent {

    @Subcomponent.Factory
    interface Factory{
        UserComponent create();
    }

    void inject(MainActivity mainActivity);

    void inject(SecondActivity secondActivity);
}
