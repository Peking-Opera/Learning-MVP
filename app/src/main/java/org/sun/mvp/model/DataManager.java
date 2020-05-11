package org.sun.mvp.model;

import org.sun.mvp.model.db.AppDbHelper;
import org.sun.mvp.model.http.AppApiHelper;
import org.sun.mvp.model.preference.AppPreferenceHelper;

public class DataManager implements AppDbHelper, AppApiHelper, AppPreferenceHelper {
    private AppDbHelper mAppDbHelper;
    private AppApiHelper mAppApiHelper;
    private AppPreferenceHelper mAppPreferenceHelper;

    public DataManager(AppDbHelper mAppDbHelper, AppApiHelper appApiHelper, AppPreferenceHelper appPreferenceHelper) {
        this.mAppDbHelper = mAppDbHelper;
        this.mAppApiHelper = appApiHelper;
        this.mAppPreferenceHelper = appPreferenceHelper;
    }


    @Override
    public void testDb() {
        mAppDbHelper.testDb();
    }

    @Override
    public void testRequestNetwork() {
        mAppApiHelper.testRequestNetwork();
    }

    @Override
    public void testPreference() {
        mAppPreferenceHelper.testPreference();
    }
}