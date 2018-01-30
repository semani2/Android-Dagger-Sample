package com.sai.dagger2sample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.sai.dagger2sample.root.App;

import javax.inject.Inject;

import dagger.android.AndroidInjection;

public class MainActivity extends AppCompatActivity implements MainMVP.View{

    @Inject
    MainMVP.Presenter mPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AndroidInjection.inject(this);

        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mPresenter.showData();
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        mPresenter.setView(this);
    }

    @Override
    public void showMessge(String msg) {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }
}
