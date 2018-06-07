package com.example.lbiuser.demoapp.di.components;


import com.example.lbiuser.demoapp.di.module.MainModule;
import com.example.lbiuser.demoapp.di.scope.PerActivity;
import com.example.lbiuser.demoapp.modules.home.MainActivity;

import dagger.Component;


@PerActivity
@Component(modules = MainModule.class, dependencies = CommonApplicationComponent.class)
public interface MainComponent {

    void inject(MainActivity mainActivity);

   // void injectLogin(LoginActivity loginAcitivity);
}
