package com.example.lbiuser.demoapp.api;



import com.example.lbiuser.demoapp.mvp.model.MobileResponse;
import com.example.lbiuser.demoapp.mvp.model.UserLoginResponce;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import rx.Observable;

public interface CommonApiService
{
   /*

    @GET("/opticals/view_all_users.php")
    Call<OpticalResponce>getTheUsers();*/

    @GET("/web_services/view_mobiles.php")
    Observable<MobileResponse> getMobiles();

    @FormUrlEncoded
    @POST("/web_services/user_login.php")
    Observable<UserLoginResponce> getLogin(@Field("email") String email, @Field("password")String password);


}
