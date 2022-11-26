package com.example.subcomponent;

import android.content.Context;

import dagger.Component;
import retrofit2.Retrofit;

/**
 * @author AlexisYin
 */
//4. 将新建的模块加载到主组件
@MyScope
@Component(modules = {NetModule.class, SubComponentModule.class})
public interface ApplicationComponent {
    //2.2 去除主模块相同的注入方法
    //void inject(MainActivity mainActivity);

    //2.3 在主模块增加申明Subcomponent.Factory的方法
    UserComponent.Factory userComponent();
}
