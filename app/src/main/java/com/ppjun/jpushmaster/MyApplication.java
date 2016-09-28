package com.ppjun.jpushmaster;

import android.app.Application;

import cn.jpush.android.api.JPushInterface;

/**
 * Package :com.ppjun.jpushmaster
 * Description :
 * Author :Rc3
 * Created at :2016/9/27 17:01.
 */

public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        JPushInterface.setDebugMode(true);
        JPushInterface.init(this);
    }
}
