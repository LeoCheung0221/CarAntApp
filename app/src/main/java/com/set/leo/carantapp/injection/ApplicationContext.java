package com.set.leo.carantapp.injection;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Qualifier;

/**
 * author：leo on 2016/5/30 09:02
 * email： leocheung4ever@gmail.com
 * description: Qualifier: when the type of class is insufficient to discriminate a dependency
 * what & why is modified:
 */

@Qualifier
@Retention(RetentionPolicy.RUNTIME)
public @interface ApplicationContext {
}
