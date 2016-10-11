package com.itheima.fragmentevent.event;
/*
 *  @项目名：  FragmentEvent 
 *  @包名：    com.itheima.fragmentevent.event
 *  @文件名:   Event
 *  @创建者:   Administrator
 *  @创建时间: 十月
 *  @描述：    TODO
 */

public class Event {

    private String mMsg;
    public Event(String msg) {

        mMsg = msg;
    }
    public String getMsg(){
        return mMsg;
    }
}