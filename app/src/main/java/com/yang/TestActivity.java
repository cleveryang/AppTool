package com.yang;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;

import com.yang.apptool.base.NbBaseActivity;
import com.yang.apptool.tool.NbBarTool;

/**
 * Created by yang on 2018/3/27.
 */

public class TestActivity extends NbBaseActivity {

    public static void startActivity(Context ctx) {
        Intent intent = new Intent(ctx, TestActivity.class);
        ctx.startActivity(intent);
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

        NbBarTool.setStatusBarColor(mContext, R.color.color_d0d0d0);


    }
}
