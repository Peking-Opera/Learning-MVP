package org.sun.mvp.base;

public interface IBasePresenter<V extends IBaseView> {
    /**
     * 绑定View
     *
     * @param view
     */
    void attachView(V view);
}