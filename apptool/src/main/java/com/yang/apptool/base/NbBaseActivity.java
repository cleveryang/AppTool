package com.yang.apptool.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.yang.apptool.tool.NbActivityTool;

/**
 * Created by yang on 2018/3/21.
 *
 * Activity 基础封装
 */

public class NbBaseActivity extends AppCompatActivity {

    private NbBaseActivity mContext;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mContext = this;
        NbActivityTool.addActivity(this);
    }
}
