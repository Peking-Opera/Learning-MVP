package org.sun.mvp.model.db;

import android.util.Log;

public class DbHelper implements AppDbHelper {
    @Override
    public void testDb() {
        Log.d("print", "数据库操作");
    }
}