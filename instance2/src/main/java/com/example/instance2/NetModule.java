package com.example.instance2;

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

    @Provides
    public User provideUser() {
        return new User();
    }

    //第二种方式告知Dagger，可以通过调用该方法来获取到要注入对象的实例
    //注入对象无法通过构造方法来创建，使用模块的@Provides或@Binds注解，并将模块装载到组件
    @Provides
    public Retrofit provideRetrofit(OkHttpClient client) {
        return new Retrofit.Builder().client(client).baseUrl("http://www.google.com").build();
    }

    @Provides
    public ApiService provideApiService(Retrofit retrofit) {
        //已知获取Retrofit实例的方法，则将Retrofit实例作为参数传入
        //new Retrofit.Builder().baseUrl("http://www.google.com").build().create(ApiService.class);
        return retrofit.create(ApiService.class);
    }

    @Provides
    public OkHttpClient provideOkHttpClient() {
        return new OkHttpClient.Builder().build();
    }
}
