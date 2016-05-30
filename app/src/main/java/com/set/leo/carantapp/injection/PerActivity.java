package com.set.leo.carantapp.injection;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

/**
 * author：leo on 2016/5/30 09:40
 * email： leocheung4ever@gmail.com
 * description: limit the scope of annotation
 * what & why is modified:
 */

/*  A scoping annotation to permit objects
 *  whose lifetime should confirm to the life
 *  of the DataManager to be memorised in the
 *  correct component.
 */

@Scope
@Retention(RetentionPolicy.RUNTIME)
public @interface PerActivity {
}
