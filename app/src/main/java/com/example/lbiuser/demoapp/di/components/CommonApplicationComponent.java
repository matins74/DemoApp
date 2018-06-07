package com.example.lbiuser.demoapp.di.components;


import android.content.Context;


import com.example.lbiuser.demoapp.di.module.CommonApplicationModule;

import javax.inject.Singleton;

import dagger.Component;
import dagger.Provides;
import retrofit2.Retrofit;

@Component(modules = CommonApplicationModule.class)
@Singleton
public interface CommonApplicationComponent {
   // void applyInjction(CommonApplication application);

    Retrofit exposeRetrofit();
    Context exposeContext();

}
