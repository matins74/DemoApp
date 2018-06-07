package com.example.lbiuser.demoapp.mvp.view;

import com.example.lbiuser.demoapp.mvp.model.MobileResponseResult;


import java.util.List;

public interface MainView extends BaseView {
    void onListLoaded(List<MobileResponseResult> list);

    void onShowDilaog(String message);

    void onHideDilaog();

    void onShowToast(String message);

    void clearItems();

}
