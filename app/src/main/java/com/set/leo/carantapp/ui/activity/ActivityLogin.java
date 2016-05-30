package com.set.leo.carantapp.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.set.leo.andlibrary.lib_uiframework.FragmentBase;
import com.set.leo.carantapp.R;
import com.set.leo.carantapp.base.ActivityBaseToolBar;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class ActivityLogin extends ActivityBaseToolBar {

    @Override
    protected void handleIntent(Intent intent) {

    }

    @Override
    protected FragmentBase getFirstFragment() {
        return null;
    }

    @Override
    protected int setHeaderName() {
        return R.string.header_name_login;
    }

    @Override
    protected boolean setHeaderBackIcon() {
        return false;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        ButterKnife.bind(this);
    }

    @OnClick({R.id.btnLogin, R.id.tvForget, R.id.tvSignIn})
    void click(View view) {
        switch (view.getId()) {
            case R.id.btnLogin:
                ActivityHome.display(this);
                break;
            case R.id.tvForget:
                ActivityRetrievePwd.display(this);
                break;
            case R.id.tvSignIn:
                ActivitySignIn.display(this);
                break;
        }
    }
}
