package com.aha.aha.app;

import com.bmobwork.bmobwork.helper.BmobInit;
import com.hiber.hiber.language.RootApp;

/*
 * Created by Administrator on 2021/02/025.
 */
public class ahaApp extends RootApp {
    @Override
    public void onCreate() {
        super.onCreate();
        BmobInit.init(this);
    }
}
