package com.set.leo.carantapp.injection.component;

import com.set.leo.carantapp.injection.module.ApplicationModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * author：leo on 2016/5/30 09:44
 * email： leocheung4ever@gmail.com
 * description: singleton
 * what & why is modified:
 */

@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {


}
