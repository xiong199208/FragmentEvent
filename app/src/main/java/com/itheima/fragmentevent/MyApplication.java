package com.itheima.fragmentevent;/*
 *  @项目名：  GoogleStore 
 *  @包名：    com.itheima.googlestore.base
 *  @文件名:   MyApplication
 *  @创建者:   Administrator
 *  @创建时间: 九月
 *  @描述：    TODO
 */

import android.app.Application;

public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        UiUtils.init(this);
    }
}
