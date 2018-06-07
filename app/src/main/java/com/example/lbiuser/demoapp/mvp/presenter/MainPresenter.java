package com.example.lbiuser.demoapp.mvp.presenter;




import com.example.lbiuser.demoapp.api.CommonApiService;
import com.example.lbiuser.demoapp.base.BasePresnter;
import com.example.lbiuser.demoapp.mapper.MainMapper;
import com.example.lbiuser.demoapp.mvp.model.MobileResponse;
import com.example.lbiuser.demoapp.mvp.model.MobileResponseResult;
import com.example.lbiuser.demoapp.mvp.view.MainView;


import java.util.List;

import javax.inject.Inject;

import rx.Observable;
import rx.Observer;

public class MainPresenter extends BasePresnter<MainView> implements Observer<MobileResponse>
{

    @Inject
    protected CommonApiService commonApiService;
    @Inject
    protected MainMapper mobileListMapper;

    @Inject
    MainPresenter()
    {

    }

    public void getMobiles()
    {
        getView().onShowDilaog("Loading.....");
        Observable<MobileResponse> mobileResponseObservable = commonApiService.getMobiles();
        subscribe(mobileResponseObservable,this);
    }

    @Override
    public void onCompleted() {
        getView().onHideDilaog();
        getView().onShowToast("Loading complete.....");
    }

    @Override
    public void onError(Throwable e) {
        getView().onHideDilaog();
        getView().onShowToast("Error loading....." + e.getMessage());

    }

    @Override
    public void onNext(MobileResponse mobileResponse) {

        List<MobileResponseResult> list = MainMapper.mapMobile(mobileResponse);
        getView().clearItems();
        getView().onListLoaded(list);
    }
}
