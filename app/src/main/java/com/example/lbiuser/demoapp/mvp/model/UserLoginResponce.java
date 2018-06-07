package com.example.lbiuser.demoapp.mvp.model;



public class UserLoginResponce {
    private boolean result;
    private UserLoginResponceUser_info[] user_info;

    public boolean getResult() {
        return this.result;
    }

    public void setResult(boolean result) {
        this.result = result;
    }

    public UserLoginResponceUser_info[] getUser_info() {
        return this.user_info;
    }

    public void setUser_info(UserLoginResponceUser_info[] user_info) {
        this.user_info = user_info;
    }
}
