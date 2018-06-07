package com.example.lbiuser.demoapp.mvp.model;



public class MobileResponse {
    private String success;
    private MobileResponseResult[] Result;

    public String getSuccess() {
        return this.success;
    }

    public void setSuccess(String success) {
        this.success = success;
    }

    public MobileResponseResult[] getResult() {
        return this.Result;
    }

    public void setResult(MobileResponseResult[] Result) {
        this.Result = Result;
    }
}
