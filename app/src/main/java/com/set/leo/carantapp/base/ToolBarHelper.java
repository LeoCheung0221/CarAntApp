package com.set.leo.carantapp.base;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

import com.set.leo.carantapp.R;

/**
 * author：leo on 2016/5/27 12:55
 * email： leocheung4ever@gmail.com
 * description: toolbar helper class
 * what & why is modified:
 */
public class ToolBarHelper {

    private Context mContext;
    private FrameLayout mContentView; //base view
    private View mUserView; //custom view
    private Toolbar mToolBar; //toolbar
    private LayoutInflater mInflater; //view inflater

    /*
     * two properties
     * 1、toolbar: float up window
     * 2、toolbar: height
     * */
    private static int[] ATTRS = {
            R.attr.windowActionBarOverlay,
            R.attr.actionBarSize
    };

    /*scratch custom view ,add toolbar view */
    public ToolBarHelper(Context context, int layoutId) {
        this.mContext = context;
        mInflater = LayoutInflater.from(mContext);
        initContentView();
        initComponentView(layoutId);
        initToolBar();
    }

    private void initContentView() {
        mContentView = new FrameLayout(mContext);
        ViewGroup.LayoutParams params = new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.MATCH_PARENT);
        mContentView.setLayoutParams(params);

    }

    private void initComponentView(int id) {
        mUserView = mInflater.inflate(id, null);
        FrameLayout.LayoutParams params = new FrameLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
        TypedArray typedArray = mContext.getTheme().obtainStyledAttributes(ATTRS);
        boolean overly = typedArray.getBoolean(0, false);
        int toolBarSize = (int) typedArray.getDimension(1, (int) mContext.getResources().getDimension(R.dimen.abc_action_bar_default_height_material));
        typedArray.recycle();
        params.topMargin = overly ? 0 : toolBarSize;
        mContentView.addView(mUserView, params);
    }

    private void initToolBar() {
        View toolbar = mInflater.inflate(R.layout.toolbar, mContentView);
        mToolBar = (Toolbar) toolbar.findViewById(R.id.id_tool_bar);
    }

    public FrameLayout getContentView() {
        return mContentView;
    }

    public Toolbar getToolBar() {
        return mToolBar;
    }
}
