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
import android.widget.Button;
import android.widget.TextView;

import com.itheima.fragmentevent.MainActivity;
import com.itheima.fragmentevent.R;
import com.itheima.fragmentevent.UiUtils;

import butterknife.Bind;
import butterknife.ButterKnife;

public class Fragment01 extends Fragment {



    @Bind(R.id.tv_fragment01)
    TextView mTvFragment01;
    @Bind(R.id.jiangli)
    Button jiangli;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = View.inflate(UiUtils.getContext(), R.layout.code_fragment01, null);

        ButterKnife.bind(this, view);

        jiangli.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity main = (MainActivity) getActivity();
                main.setSendMassage("生锈的铁剑");


            }
        });

        return view;

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        ButterKnife.unbind(this);
    }

    public void setText(String content) {
        jiangli.setVisibility(View.VISIBLE);
        mTvFragment01.setText(content);
    }

}
