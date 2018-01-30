package com.sai.dagger2sample.root;

import android.app.Application;

import com.sai.dagger2sample.MainActivity;
import com.sai.dagger2sample.MainModule;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

/**
 * Created by sai on 1/29/18.
 */

@Module
public abstract class ApplicationModule {

    private Application mApplication;

    public ApplicationModule(Application application) {
        this.mApplication = application;
    }

    @ContributesAndroidInjector(modules = MainModule.class)
    abstract MainActivity contributeMainActivityInjector();
}

