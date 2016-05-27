package com.set.leo.carantapp.base;

import android.os.Build;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import com.readystatesoftware.systembartint.SystemBarTintManager;
import com.set.leo.carantapp.R;

/**
 * author：leo on 2016/5/27 12:30
 * email： leocheung4ever@gmail.com
 * description: activity which contains toolbar
 * what & why is modified:
 */
public abstract class ToolBarActivity extends AppActivity {

    private ToolBarHelper mToolBarHelper;
    public Toolbar toolbar;

    abstract protected int setHeaderName();

    abstract protected boolean setHeaderBackIcon();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void setContentView(int layoutResID) {
        mToolBarHelper = new ToolBarHelper(this, layoutResID);
        toolbar = mToolBarHelper.getToolBar();
        toolbar.setTitle(setHeaderName());
        if (setHeaderBackIcon() == true)
            toolbar.setNavigationIcon(R.drawable.icon_nav_back);
        else
            toolbar.setPadding(100,0,0,0);

        View contentView = mToolBarHelper.getContentView();
        contentView.setFitsSystemWindows(true);
        setContentView(contentView);

        setSupportActionBar(toolbar);
        onCreateCustomToolBar(toolbar);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            Window win = getWindow();
            WindowManager.LayoutParams winParams = win.getAttributes();
            final int bits = WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS;
            winParams.flags |= bits;
            win.setAttributes(winParams);
            SystemBarTintManager tintManager = new SystemBarTintManager(this);
            tintManager.setStatusBarTintEnabled(true);
            tintManager.setStatusBarTintResource(R.color.color_toolbar);
        }
    }

    public void onCreateCustomToolBar(Toolbar toolbar) {
        toolbar.setContentInsetsRelative(0, 0);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            finish();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
