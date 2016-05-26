package com.set.leo.carantapp.controller;

import android.app.Application;

import com.squareup.leakcanary.LeakCanary;

/**
 * author：leo on 2016/5/25 09:27
 * email： leocheung4ever@gmail.com
 * description: 应用核心类
 * what & why is modified:
 */
public class Core extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        LeakCanary.install(this);
    }
}
