package com.set.leo.carantapp.base;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.support.annotation.Nullable;
import android.support.v7.widget.Toolbar;

import com.set.leo.andlibrary.lib_uiframework.ActivityBase;
import com.set.leo.andlibrary.lib_uiframework.FragmentBase;
import com.set.leo.carantapp.R;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * author：leo on 2016/5/27 09:34
 * email： leocheung4ever@gmail.com
 * description: make further warp
 * what & why is modified:
 */
public abstract class ActivityBaseApp extends ActivityBase {

    //obtain intent & handle with it
    protected abstract void handleIntent(Intent intent);

    //obtain first fragment
    protected abstract FragmentBase getFirstFragment();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getContentViewId());

        if (null != getIntent()) {
            handleIntent(getIntent());
        }
        //avoid adding repeatedly
        if (null == getSupportFragmentManager().getFragments()) {
            FragmentBase firstFragment = getFirstFragment();
            if (null != firstFragment) {
                addFragment(firstFragment);
            }
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        ButterKnife.unbind(this);
    }

    @Override
    protected int getContentViewId() {
        return R.layout.activity_base;
    }

    @Override
    protected int getFragmentContentId() {
        return R.id.fragment_container;
    }
}
