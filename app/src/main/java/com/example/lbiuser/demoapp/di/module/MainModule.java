package com.example.lbiuser.demoapp.di.module;


import com.example.lbiuser.demoapp.api.CommonApiService;
import com.example.lbiuser.demoapp.di.scope.PerActivity;
import com.example.lbiuser.demoapp.mvp.view.MainView;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;

@Module
public class MainModule {

    private MainView mainView;
   // private LoginView mainView;


    public MainModule(MainView view)
    {
        mainView = view;
    }

    @PerActivity
    @Provides
    CommonApiService provideApiService(Retrofit retrofit)
    {
        return retrofit.create(CommonApiService.class);
    }

    @PerActivity
    @Provides
    MainView provideMainView()
    {
        return mainView;
    }
}
