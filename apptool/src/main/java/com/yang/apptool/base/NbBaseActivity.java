package com.yang.apptool.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.yang.apptool.tool.NbActivityTool;

/**
 * Created by yang on 2018/3/21.
 * <p>
 * Activity 基础封装
 */

public class NbBaseActivity extends AppCompatActivity {

    protected NbBaseActivity mContext;
    protected String TAG;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TAG = this.getClass().getSimpleName();
        mContext = this;
        NbActivityTool.addActivity(this);
    }
}
