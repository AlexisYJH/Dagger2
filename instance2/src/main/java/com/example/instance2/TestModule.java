package com.example.instance2;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

/**
 * @author AlexisYin
 */
@Module
public abstract class TestModule {
    //接口注入-1) 使用@Binds注解，抽象方法，抽象类
    @Binds
    abstract AInterface bindAInterface(
            AInterfaceImpl01 impl);
            //AInterfaceImpl02 impl);

    //接口注入-2) 使用@Provides注解，静态方法
    //接口注入-3) 装载到组件
    @Provides
    static AInterfaceImpl01 provideAInterfaceImpl01() {
        return new AInterfaceImpl01();
    }

    @Provides
    static AInterfaceImpl02 provideAInterfaceImpl02() {
        return new AInterfaceImpl02();
    }
}
