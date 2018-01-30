package com.sai.dagger2sample;

import dagger.Module;
import dagger.Provides;

/**
 * Created by sai on 1/29/18.
 */

@Module
public class  MainModule {

    @Provides
    public MainMVP.Presenter provideMainPresenter() {
        return new MainPresenter();
    }

}
