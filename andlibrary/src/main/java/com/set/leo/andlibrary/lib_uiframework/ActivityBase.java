package com.set.leo.andlibrary.lib_uiframework;

import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;

public abstract class ActivityBase extends AppCompatActivity {

    //obtain layout id
    abstract protected int getContentViewId();

    //obtain fragment id in layout
    abstract protected int getFragmentContentId();

    //add fragment
    protected void addFragment(FragmentBase fragment) {
        if (fragment != null)
            getSupportFragmentManager().beginTransaction()
                    .replace(getFragmentContentId(), fragment, fragment.getClass().getSimpleName())
                    .addToBackStack(fragment.getClass().getSimpleName())
                    .commitAllowingStateLoss(); //allow to happen exception & commit
    }

    //remove fragment
    protected void removeFragment() {
        if (getSupportFragmentManager().getBackStackEntryCount() > 1)
            getSupportFragmentManager().popBackStack();
        else
            finish();
    }

    //back event
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (event.KEYCODE_BACK == keyCode) {
            if (getSupportFragmentManager().getBackStackEntryCount() == 1) {
                finish();
                return true;
            }
        }
        return super.onKeyDown(keyCode, event);
    }
}
