package org.sun.mvp.presenter;

import android.util.Log;

import org.sun.mvp.base.BasePresenter;
import org.sun.mvp.contract.MainContract;

public class MainPresenter extends BasePresenter<MainContract.View> implements MainContract.Presenter {


    @Override
    public void testGetMpresenter() {
        Log.d("print", "我是P层的引用");
        mView.testGetMview();
    }

    @Override
    public void testDb() {
        mDataManager.testDb();
    }

    @Override
    public void testRequestNetwork() {
        mDataManager.testRequestNetwork();
    }

    @Override
    public void testPreference() {
        mDataManager.testPreference();
    }
}