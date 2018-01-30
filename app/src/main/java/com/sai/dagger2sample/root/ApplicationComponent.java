package com.sai.dagger2sample.root;

import javax.inject.Singleton;

import dagger.Component;
import dagger.android.AndroidInjectionModule;

/**
 * Created by sai on 1/29/18.
 */

@Singleton
@Component(modules = {AndroidInjectionModule.class, ApplicationModule.class})
interface ApplicationComponent {
    void inject(App app);
}
