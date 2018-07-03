package com.yang.apptool.base;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * Created by yang on 2018/4/8.
 */

public abstract class NbBaseFragment extends Fragment {

    protected View view;
    protected Context mContext;
    protected static String TAG;
    protected Unbinder mUnbinder;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        TAG = NbBaseFragment.class.getSimpleName();
        if (view == null) {
            mContext = getActivity();
            view = setContentView(inflater, container, savedInstanceState);
        }
        ViewGroup parent = (ViewGroup) view.getParent();
        if (parent != null) {
            parent.removeView(view);
        }
        mUnbinder = ButterKnife.bind(this, view);
        initializeView();
        initializeData();
        return view;
    }

    protected abstract View setContentView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState);

    protected abstract void initializeView();

    protected abstract void initializeData();

    @Override
    public void onDestroy() {
        super.onDestroy();
        if (null != mUnbinder) mUnbinder.unbind();
        if (view != null && view.getParent() != null) {
            ViewGroup parent = (ViewGroup) view.getParent();
            parent.removeView(view);
        }
    }
}
