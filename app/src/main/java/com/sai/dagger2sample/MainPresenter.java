package com.sai.dagger2sample;

/**
 * Created by sai on 1/29/18.
 */

public class MainPresenter implements MainMVP.Presenter{

    private MainMVP.View mView;

    @Override
    public void showData() {
        mView.showMessge("Hello");
    }

    @Override
    public void setView(MainMVP.View view) {
        this.mView = view;
    }
}
