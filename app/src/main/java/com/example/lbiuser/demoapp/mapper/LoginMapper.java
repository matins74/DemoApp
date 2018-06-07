package com.example.lbiuser.demoapp.mapper;




import com.example.lbiuser.demoapp.mvp.model.UserLoginResponce;

import javax.inject.Inject;

public class LoginMapper
{
    @Inject
    public LoginMapper()
    {

    }

    public static boolean getLoginResult(UserLoginResponce userLoginResponce)
    {
        boolean result =  userLoginResponce.getResult();

        return result;
    }

}
