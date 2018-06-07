package com.example.lbiuser.demoapp.modules.login;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.lbiuser.demoapp.R;

import com.example.lbiuser.demoapp.base.BaseActivity;


import com.example.lbiuser.demoapp.di.components.DaggerLoginComponent;
import com.example.lbiuser.demoapp.di.module.LoginModule;
import com.example.lbiuser.demoapp.modules.home.MainActivity;
import com.example.lbiuser.demoapp.mvp.presenter.LoginPresenter;
import com.example.lbiuser.demoapp.mvp.view.LoginView;
import com.example.lbiuser.demoapp.utilities.NetworkUtils;


import javax.inject.Inject;

import butterknife.BindView;
import butterknife.OnClick;

public class LoginActivity extends BaseActivity implements LoginView {


    @BindView(R.id.editEmail)
    public EditText editEmail;

    @BindView(R.id.editPassword)
    public EditText editPassword;
    @BindView(R.id. btnLogin)
    public Button btnLogin;

    @Inject
    protected LoginPresenter _loginPresenter;



    @Override
    protected void onViewReady(Bundle savedInstanceState, Intent intent) {
        super.onViewReady(savedInstanceState, intent);

    }

    @OnClick(R.id.btnLogin)
    public void submitButton(View view) {
        if (view.getId() == R.id.btnLogin) {

            if(NetworkUtils.isNetworkConnected(this))
            {
                _loginPresenter.getLogin(editEmail.getText().toString(), editPassword.getText().toString());
            }
            else
            {
                showDialog("Check Network connection");
            }
        }
    }

    @Override
    protected void resolveDaggerDependancy() {
        DaggerLoginComponent.builder().commonApplicationComponent(getApplicationComponent()).loginModule(new LoginModule(LoginActivity.this)).build().inject(this);
    }

    @Override
    protected int getContentView() {
        return R.layout.activity_login_acitivity;
    }

    @Override
    public void onShowDilaog(String message) {
            showDialog(message);
    }

    @Override
    public void onHideDilaog() {
            hideDilaog();
    }

    @Override
    public void onShowToast(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }



    @Override
    public void afterLogin() {

        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();
    }


}
