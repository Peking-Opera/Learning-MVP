package org.sun.mvp.contract;

import org.sun.mvp.base.IBasePresenter;
import org.sun.mvp.base.IBaseView;

public interface MainContract {

    interface View extends IBaseView {
        void testGetMview();
    }

    interface Presenter extends IBasePresenter<View> {
        void testGetMpresenter();

        void testDb();

        void testRequestNetwork();

        void testPreference();
    }
}