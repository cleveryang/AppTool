package com.yang.apptool.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.yang.apptool.tool.NbActivityTool;

import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * Created by yang on 2018/3/21.
 * <p>
 * Activity 基础封装
 */

public abstract class NbBaseActivity extends AppCompatActivity {

    protected NbBaseActivity mContext;
    protected String TAG;
    protected Unbinder mUnbinder;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TAG = this.getClass().getSimpleName();
        mContext = this;
        NbActivityTool.addActivity(this);
        setContentView();
        mUnbinder = ButterKnife.bind(this);
        initializeView();
        initializeData();
    }

    protected abstract void setContentView();

    protected abstract void initializeView();

    protected abstract void initializeData();

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (null != mUnbinder) mUnbinder.unbind();
    }
}
