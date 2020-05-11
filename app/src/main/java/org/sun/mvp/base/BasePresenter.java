package org.sun.mvp.base;

import org.sun.mvp.model.DataManager;
import org.sun.mvp.model.db.AppDbHelper;
import org.sun.mvp.model.db.DbHelper;
import org.sun.mvp.model.http.ApiHelper;
import org.sun.mvp.model.http.AppApiHelper;
import org.sun.mvp.model.preference.AppPreferenceHelper;
import org.sun.mvp.model.preference.PreferenceHelper;

public abstract class BasePresenter<V extends IBaseView> implements IBasePresenter<V> {

    //数据管理,负责M层的业务逻辑操作
    protected DataManager mDataManager;
    //V层的引用
    protected V mView;

    /**
     * 初始化DataManager
     */
    public BasePresenter() {
        //数据库
        AppDbHelper appDbHelper = new DbHelper();
        //共享参数存储
        AppPreferenceHelper appPreferenceHelper = new PreferenceHelper();
        //网络请求
        AppApiHelper appApiHelper = new ApiHelper();
        mDataManager = new DataManager(appDbHelper, appApiHelper, appPreferenceHelper);
    }

    /**
     * 绑定view
     *
     * @param view
     */
    @Override
    public void attachView(V view) {
        this.mView = view;
    }
}