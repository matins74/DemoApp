package com.example.lbiuser.demoapp.di.components;




import com.example.lbiuser.demoapp.di.module.LoginModule;
import com.example.lbiuser.demoapp.di.scope.PerActivity;
import com.example.lbiuser.demoapp.modules.login.LoginActivity;

import dagger.Component;

@PerActivity
@Component(modules = LoginModule.class, dependencies = CommonApplicationComponent.class)
public interface LoginComponent
{
    void inject(LoginActivity mainActivity);
}
