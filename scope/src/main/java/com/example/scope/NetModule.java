package com.example.scope;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

/**
 * @author AlexisYin
 */
//1. 方式二：使用@Module声明一个类为Dagger模块，并提供创建某个对象实例的方法，然后使用@Provides或@Binds注解该方法
@Module
public class NetModule {

    //使用作用域注解，可以将某个对象的生命周期限定为其组件的生命周期
    //由于指定了以下三个对象的作用域为Singleton，所以组件上也要添加@Singleton注解
    //要么都不使用，要么都使用一样的作用域 （模块中方法使用了作用域，组件上没有使用作用域（或者作用域不一致），则编译失败，报错）

    //@Singleton是Dagger提供的一种作用域实现
    //作用域就是用来管理Component来获取对象实例的生命周期的
    @Singleton
    @Provides
    public ApiService provideApiService(Retrofit retrofit) {
        return retrofit.create(ApiService.class);
    }

    @Singleton
    @Provides
    public Retrofit provideRetrofit(OkHttpClient client) {
        return new Retrofit.Builder().client(client).baseUrl("http://www.google.com").build();
    }

    @Singleton
    @Provides
    public OkHttpClient provideOkHttpClient() {
        return new OkHttpClient.Builder().build();
    }
}
