package com.example.lbiuser.demoapp.di.module;


import com.example.lbiuser.demoapp.api.CommonApiService;
import com.example.lbiuser.demoapp.di.scope.PerActivity;
import com.example.lbiuser.demoapp.mvp.view.LoginView;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;

@Module
public class LoginModule {

    // private MainView mainView;
    private LoginView mainView;

    public LoginModule(LoginView view)
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
    LoginView provideMainView()
    {
        return mainView;
    }
}
