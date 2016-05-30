package com.set.leo.carantapp.injection.module;

import android.app.Application;
import android.content.Context;

import com.set.leo.carantapp.data.remote.ServiceCarAnt;
import com.set.leo.carantapp.injection.ApplicationContext;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * author：leo on 2016/5/30 09:46
 * email： leocheung4ever@gmail.com
 * description: Provide application-level dependencies. Mainly singleton object that can be
 * injected from anywhere in the app
 * what & why is modified:
 */

@Module
public class ApplicationModule {

    protected final Application mApplication;

    public ApplicationModule(Application mApplication) {
        this.mApplication = mApplication;
    }

    @Provides
    Application provideApplication() {
        return mApplication;
    }

    @Provides
    @ApplicationContext
    Context provideContext() {
        return mApplication;
    }

    @Provides
    @Singleton
    ServiceCarAnt provideCarAntService() {
        return ServiceCarAnt.Factory.initializeApi();
    }
}
