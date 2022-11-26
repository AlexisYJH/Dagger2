package com.example.componentdependencies;

import dagger.Component;

/**
 * @author AlexisYin
 */

/**
 * 2.1 新建组件，声明注入方法
 * 2.2 添加依赖
 * 2.3 去除被依赖组件上相同的注入方法
 * 3. 为新组件和其模块中的方法添加作用域，新组建和被依赖组件的作用域必须不一致
 */
@UserScope
@Component(modules = UserModule.class, dependencies = ApplicationComponent.class)
public interface UserComponent {
    //2.1 没有添加依赖时，直接运行，编译报错，因为ApplicationComponent和UserComponent都要对MainActivity进行注入，无法兼容
    void inject(MainActivity mainActivity);
}
