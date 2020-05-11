package org.sun.mvp.ui.activity;

import android.util.Log;

import org.sun.mvp.R;
import org.sun.mvp.base.BaseActivity;
import org.sun.mvp.contract.MainContract;
import org.sun.mvp.presenter.MainPresenter;

public class MainActivity extends BaseActivity<MainPresenter> implements MainContract.View {


    @Override
    protected void initPresenter() {
        mPresenter = new MainPresenter();
    }

    @Override
    protected void initView() {
        mPresenter.testGetMpresenter();
        mPresenter.testDb();
        mPresenter.testRequestNetwork();
        mPresenter.testPreference();
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    public void testGetMview() {
        Log.d("print", "我是V层的引用");
    }
}