package com.set.leo.carantapp.data.local;

import android.content.Context;
import android.content.SharedPreferences;

import com.set.leo.carantapp.injection.ApplicationContext;

import javax.inject.Inject;

/**
 * author：leo on 2016/5/30 08:52
 * email： leocheung4ever@gmail.com
 * description: SharedPreference helper
 * what & why is modified:
 */
public class PreferencesHelper {

    public static final String PREF_FILE_NAME = "carant_pref_file";

    private final SharedPreferences mPref;

    @Inject
    public PreferencesHelper(@ApplicationContext Context context) {
        mPref = context.getSharedPreferences(PREF_FILE_NAME, Context.MODE_PRIVATE);
    }

    public void clear() {
        mPref.edit().clear().apply();
    }
}
