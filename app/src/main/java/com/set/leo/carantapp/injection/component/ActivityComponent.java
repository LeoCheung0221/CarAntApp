package com.set.leo.carantapp.injection.component;

import com.set.leo.carantapp.injection.PerActivity;

import dagger.Component;

/**
 * author：leo on 2016/5/30 09:36
 * email： leocheung4ever@gmail.com
 * description: this is an injector, that is the bridge between @Inject and @Module
 * what & why is modified:
 */

@PerActivity
@Component(dependencies = ApplicationComponent.class)
public interface ActivityComponent {

}
