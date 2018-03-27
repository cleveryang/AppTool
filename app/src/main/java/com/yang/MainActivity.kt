package com.yang

import android.os.Bundle
import com.yang.apptool.base.NbBaseActivity
import com.yang.apptool.tool.NbBarTool

class MainActivity : NbBaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        NbBarTool.transparencyBar(mContext)
        NbBarTool.StatusBarLightMode(mContext)

        TestActivity.startActivity(mContext)
    }
}
