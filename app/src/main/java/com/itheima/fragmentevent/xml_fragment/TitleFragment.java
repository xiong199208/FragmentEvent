package com.itheima.fragmentevent.xml_fragment;
/*
 *  @项目名：  FragmentEvent 
 *  @包名：    com.itheima.fragmentevent.xml_fragment
 *  @文件名:   TitleFragment
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
import android.widget.Button;

import com.itheima.fragmentevent.R;
import com.itheima.fragmentevent.UiUtils;
import com.itheima.fragmentevent.event.Event;

import org.greenrobot.eventbus.EventBus;

public class TitleFragment extends Fragment implements View.OnClickListener {

    private Button mBut01;
    private Button mBut02;
    private Button mBut03;
    private Button mBut04;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = View.inflate(UiUtils.getContext(), R.layout.xml_title,null);


        mBut01 = (Button) view.findViewById(R.id.fragment01);
        mBut02 = (Button) view.findViewById(R.id.fragment02);
        mBut03 = (Button) view.findViewById(R.id.fragment03);
        mBut04 = (Button) view.findViewById(R.id.fragment04);

        mBut01.setOnClickListener(this);
        mBut02.setOnClickListener(this);
        mBut03.setOnClickListener(this);
        mBut04.setOnClickListener(this);

        return view;
    }

    /**
     * TitleFragment四个按钮的点击事件
     * @param v
     */
    @Override
    public void onClick(View v) {

        switch (v.getId()) {
                case R.id.fragment01:
                    EventBus.getDefault().post(new Event("赵日天"));

                    break;
                case R.id.fragment02:
                    EventBus.getDefault().post(new Event("叶良辰"));
                    break;
                case R.id.fragment03:
                    EventBus.getDefault().post(new Event("龙傲天"));
                    break;
                case R.id.fragment04:
                    EventBus.getDefault().post(new Event("刘斩仙"));
                    break;
        }

    }
}
