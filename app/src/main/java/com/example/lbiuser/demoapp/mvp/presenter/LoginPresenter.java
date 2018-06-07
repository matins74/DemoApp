package com.example.lbiuser.demoapp.mvp.presenter;

import android.content.Intent;
import android.util.Log;


import com.example.lbiuser.demoapp.api.CommonApiService;
import com.example.lbiuser.demoapp.base.BasePresnter;
import com.example.lbiuser.demoapp.mapper.LoginMapper;
import com.example.lbiuser.demoapp.mvp.model.UserLoginResponce;
import com.example.lbiuser.demoapp.mvp.view.LoginView;

import javax.inject.Inject;

import rx.Observable;
import rx.Observer;

public class LoginPresenter extends BasePresnter<LoginView> implements Observer<UserLoginResponce> {

    @Inject protected CommonApiService commonApiService;
    @Inject
    protected LoginMapper loginMapper;


    @Inject
    LoginPresenter()
    {

    }

    @Override
    public void onCompleted() {
        getView().onHideDilaog();
        getView().onShowToast("Login complete.....");

    }

    public void getLogin(String email, String pass)
    {
        getView().onShowDilaog("Loading....");
        Observable<UserLoginResponce> userLoginResponceObservable = commonApiService.getLogin(email,pass);
        subscribe(userLoginResponceObservable,this);
    }
    @Override
    public void onError(Throwable e) {
        getView().onHideDilaog();
        getView().onShowToast("Error loading....." + e.getMessage());
    }

    @Override
    public void onNext(UserLoginResponce userLoginResponce) {

        Log.d("LoginResponse" , ""+userLoginResponce.getResult());

        boolean res = LoginMapper.getLoginResult(userLoginResponce);

        if(res)
        {
            //Intent intent = new Intent()
            getView().afterLogin();
        }
        else
        {
            getView().onShowToast("Error in responce");
        }
    }
}
