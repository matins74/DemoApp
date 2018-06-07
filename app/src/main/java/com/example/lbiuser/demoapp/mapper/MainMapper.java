package com.example.lbiuser.demoapp.mapper;



import com.example.lbiuser.demoapp.mvp.model.MobileResponse;
import com.example.lbiuser.demoapp.mvp.model.MobileResponseResult;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

public class MainMapper {
    @Inject
    public MainMapper() {

    }

    public static List<MobileResponseResult> mapMobile(MobileResponse mobileResponse) {
        List<MobileResponseResult> mobileResponseResultList = new ArrayList<>();
        if (mobileResponse != null) {


            MobileResponseResult[] mobileResponseResults = mobileResponse.getResult();
            if (mobileResponseResults != null) {

                for (MobileResponseResult mobileResponseResult : mobileResponseResults) {
                    MobileResponseResult mobileResponseResult1 = new MobileResponseResult();
                    mobileResponseResult1.setProduct_name(mobileResponseResult.getProduct_name());
                    mobileResponseResult1.setProduct_img_name(mobileResponseResult.getProduct_img_name());
                    mobileResponseResult1.setBrand(mobileResponseResult.getBrand());

                    mobileResponseResultList.add(mobileResponseResult1);
                }
            }
        }
        return mobileResponseResultList;
    }
}
