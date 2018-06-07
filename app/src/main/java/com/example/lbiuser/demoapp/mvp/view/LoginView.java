package com.example.lbiuser.demoapp.mvp.view;



public interface LoginView extends BaseView
{

    void onShowDilaog(String message);

    void onHideDilaog();

    void onShowToast(String message);

    void afterLogin();
}
