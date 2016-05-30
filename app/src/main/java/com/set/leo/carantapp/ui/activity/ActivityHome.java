package com.set.leo.carantapp.ui.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.view.MenuItem;

import com.set.leo.andlibrary.lib_uiframework.FragmentBase;
import com.set.leo.carantapp.R;
import com.set.leo.carantapp.base.ActivityBaseApp;

import butterknife.Bind;
import butterknife.ButterKnife;

public class ActivityHome extends ActivityBaseApp
        implements NavigationView.OnNavigationItemSelectedListener {

    @Bind(R.id.drawer_layout) DrawerLayout drawer;
    @Bind(R.id.nav_view) NavigationView navigationView;

    @Override
    protected void handleIntent(Intent intent) {

    }

    @Override
    protected FragmentBase getFirstFragment() {
        return null;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        ButterKnife.bind(this);

        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        int id = item.getItemId();
        String TAG = null;
        Fragment f = null;
        switch (id) {
            case R.id.nav_message_center:
//                SuperToast.create(this, "消息中心", 1000);
                break;
            case R.id.nav_my_friendship:

                break;
            case R.id.nav_vip_center:

                break;
            case R.id.nav_collection:

                break;

            case R.id.nav_share:

                break;
            case R.id.nav_send:

                break;

            case R.id.nav_setting:

                break;
            case R.id.nav_logout:

                break;
            default:
                return false;
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    public static void display(Context context) {
        context.startActivity(new Intent(context, ActivityHome.class));
    }
}
