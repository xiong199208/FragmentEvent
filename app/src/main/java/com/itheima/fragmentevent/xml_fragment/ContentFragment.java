package com.itheima.fragmentevent.xml_fragment;
/*
 *  @项目名：  FragmentEvent 
 *  @包名：    com.itheima.fragmentevent.xml_fragment
 *  @文件名:   ContentFragment
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
import android.widget.TextView;

import com.itheima.fragmentevent.R;
import com.itheima.fragmentevent.UiUtils;
import com.itheima.fragmentevent.event.Event;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;


public class ContentFragment extends Fragment {

    private TextView mContent;

    @Nullable
    @Override

    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = View.inflate(UiUtils.getContext(), R.layout.xml_content,null);

        mContent = (TextView) view.findViewById(R.id.content);

        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        //注册事件接收器
        EventBus.getDefault().register(this);
    }

    /**
     * threadMode为回调所在的线程，priority为优先级，sticky为是否接收黏性事件。
     * @param event
     */
    @Subscribe(threadMode = ThreadMode.POSTING, priority = 0, sticky = true)
    public void MyEvent(Event event) {
       String name = event.getMsg();
        mContent.setText(name+"打了十个");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        //注销事件接收器
        EventBus.getDefault().unregister(this);
    }
}
