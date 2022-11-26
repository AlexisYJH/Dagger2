package com.example.instance1;

import dagger.Component;

/**
 * @author AlexisYin
 */
//2. 新建Dagger组件（接口），添加@Component注解，增加注入方法
@Component
public interface ApplicationComponent {

    //指定要注入的目标类作为方法参数
    void inject(MainActivity mainActivity);
}
