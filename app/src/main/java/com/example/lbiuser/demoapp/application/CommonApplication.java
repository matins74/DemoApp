package com.example.lbiuser.demoapp.application;

import android.app.Application;

import com.example.lbiuser.demoapp.di.components.CommonApplicationComponent;

import com.example.lbiuser.demoapp.di.module.CommonApplicationModule;
import com.example.lbiuser.demoapp.di.components.DaggerCommonApplicationComponent;


public class CommonApplication extends Application
{

    private CommonApplicationComponent applicationComponent;
    @Override
    public void onCreate() {
        super.onCreate();
        initialiseApplicationComponent();
    }

    private void initialiseApplicationComponent() {
        applicationComponent = DaggerCommonApplicationComponent.builder().commonApplicationModule(new CommonApplicationModule(this,"http://quans.co.in")).build();
    }

    public CommonApplicationComponent getApplicationComponent() {
        return applicationComponent;
    }

    @Override
    public void onTerminate() {
        super.onTerminate();
    }
}


// For optical
// http://mysociety360.com