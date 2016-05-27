package com.set.leo.andlibrary.lib_uiframework;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * author：leo on 2016/5/27 09:19
 * email： leocheung4ever@gmail.com
 * description: base fragment
 * what & why is modified:
 */
public abstract class FragmentBase extends Fragment {

    protected ActivityBase mActivity;

    //obtain layout
    abstract protected int getLayoutId();

    //initial , need to determine
    //NOTE: in case of pointer exception, when resources are nervous, the process of app will be killed
    protected abstract void initView(View view, Bundle savedInstanceState);

    //obtain host activity
    protected ActivityBase getHoldingActivity() {
        return mActivity;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        mActivity = (ActivityBase) context;
    }

    //add fragment
    protected void addFragment(FragmentBase fragment) {
        if (null != fragment)
            getHoldingActivity().addFragment(fragment);
    }

    protected void removeFragment() {
        getHoldingActivity().removeFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(getLayoutId(), container, false);
        initView(view, savedInstanceState);
        return view;
    }
}
