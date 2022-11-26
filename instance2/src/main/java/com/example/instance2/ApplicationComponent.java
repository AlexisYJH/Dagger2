package com.example.instance2;

import dagger.Component;

/**
 * @author AlexisYin
 */
//2. 新建Dagger组件（接口），添加@Component注解，将模块装载到组件，增加注入方法
//接口注入-3) 装载到组件
@Component(modules = {NetModule.class, TestModule.class})
public interface ApplicationComponent {

    //指定要注入的目标类作为方法参数
    void inject(MainActivity mainActivity);
}
