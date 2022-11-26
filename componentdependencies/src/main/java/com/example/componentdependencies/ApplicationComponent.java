package com.example.componentdependencies;

import android.content.Context;

import dagger.Component;
import retrofit2.Retrofit;

/**
 * @author AlexisYin
 */
@MyScope
@Component(modules = NetModule.class)
public interface ApplicationComponent {
    //2.3 去除被依赖组件上相同的注入方法
    //void inject(MainActivity mainActivity);

    //4. 在被依赖组件中显示声明所需方法，不显示声明会导致编译失败
    Retrofit retrofit();

    ApiService apiService();

    Context context();
}
