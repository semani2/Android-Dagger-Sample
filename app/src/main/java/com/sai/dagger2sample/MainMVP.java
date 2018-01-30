package com.sai.dagger2sample;

/**
 * Created by sai on 1/29/18.
 */

public interface MainMVP {

    interface  View {
        void showMessge(String msg);
    }

    interface Presenter {
        void showData();

        void setView(MainMVP.View view);
    }
}
