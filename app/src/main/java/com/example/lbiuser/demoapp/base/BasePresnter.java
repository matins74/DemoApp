package com.example.lbiuser.demoapp.base;



import com.example.lbiuser.demoapp.mvp.view.BaseView;

import javax.inject.Inject;

import rx.Observable;
import rx.Observer;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

public class BasePresnter<V extends BaseView> {


    @Inject protected V mview;

    protected V getView()
    {
        return mview;
    }
    protected <T> void  subscribe(Observable<T> observable , Observer<T> observer)
    {
        observable.subscribeOn(Schedulers.newThread())
                .toSingle().observeOn(AndroidSchedulers.mainThread()).subscribe(observer);
    }
}
