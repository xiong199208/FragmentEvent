package com.itheima.fragmentevent;/*
 *  @项目名：  GoogleStore 
 *  @包名：    com.itheima.googlestore.utils
 *  @文件名:   UiUtils
 *  @创建者:   Administrator
 *  @创建时间: 九月
 *  @描述：    TODO
 */

import android.content.Context;
import android.os.Handler;

public class UiUtils {

    public static Context mContext;
    private static Handler mHandler;

    public static void init(MyApplication googlePlay) {
        mContext = googlePlay;

        mHandler = new Handler();
    }

    /**
     * 获得全局的context
     * @return
     */
    public static Context getContext() {
        return mContext;
    }

    public static Handler getHandler() {
        return mHandler;
    }


    /**
     * 开启一个子线程
     * @param task
     */
    public static void post(Runnable task) {
        mHandler.post(task);
    }

    /**
     * 开启一个延时子线程
     * @param task
     * @param duration
     */
    public static void postDelay(Runnable task,long duration) {
        mHandler.postDelayed(task,duration);
    }

    /**
     * 取消一个子线程
     * @param task
     */
    public static void removeHandler(Runnable task) {
        mHandler.removeCallbacks(task);
    }

    public static String[] getStringArray(int resId) {
        return mContext.getResources().getStringArray(resId);
    }
}
