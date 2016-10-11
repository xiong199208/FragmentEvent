package com.itheima.fragmentevent.code_fragment;
/*
 *  @项目名：  FragmentEvent 
 *  @包名：    com.itheima.fragmentevent.code_fragment
 *  @文件名:   Fragment01
 *  @创建者:   Administrator
 *  @创建时间: 十月
 *  @描述：    TODO
 */

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.itheima.fragmentevent.R;
import com.itheima.fragmentevent.UiUtils;

public class Fragment02 extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return View.inflate(UiUtils.getContext(), R.layout.code_fragment02,null);
    }
}
