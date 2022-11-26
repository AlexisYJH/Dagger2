package com.example.scope;

import javax.inject.Singleton;

import dagger.Component;

/**
 * @author AlexisYin
 */
//2. 新建Dagger组件（接口），添加@Component注解，将模块装载到组件，增加注入方法

@Singleton
@Component(modules = NetModule.class)
public interface ApplicationComponent {

    //指定要注入的目标类作为方法参数
    void inject(MainActivity mainActivity);

    void inject(SecondActivity secondActivity);
}
