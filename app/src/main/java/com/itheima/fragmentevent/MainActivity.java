package com.itheima.fragmentevent;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.itheima.fragmentevent.code_fragment.Fragment01;
import com.itheima.fragmentevent.code_fragment.Fragment02;
import com.itheima.fragmentevent.code_fragment.Fragment03;
import com.itheima.fragmentevent.code_fragment.Fragment04;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    private Button mBut01;
    private Button mBut02;
    private Button mBut03;
    private Button mBut04;
    private FragmentTransaction mTransaction;
    private View view;
    private FragmentManager mFragmentManager;
    private View mContent;
    private Button mSendMassage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*initView();
        initListen();
        initFragment();*/

    }
    private void initFragment() {

        mFragmentManager = getSupportFragmentManager();

    }
    private void initListen() {
        mBut01.setOnClickListener(this);
        mBut02.setOnClickListener(this);
        mBut03.setOnClickListener(this);
        mBut04.setOnClickListener(this);
    }

    private void initView() {

        mSendMassage = (Button) findViewById(R.id.but_send);
        view = findViewById(R.id.fragment_title);
        mContent = findViewById(R.id.fragment_content);

        mBut01 = (Button) view.findViewById(R.id.fragment01);
        mBut02 = (Button) view.findViewById(R.id.fragment02);
        mBut03 = (Button) view.findViewById(R.id.fragment03);
        mBut04 = (Button) view.findViewById(R.id.fragment04);
    }


    @Override
    public void onClick(View v) {

        mTransaction = mFragmentManager.beginTransaction();
        mContent.setVisibility(View.INVISIBLE);
        switch (v.getId()) {
            case R.id.fragment01:
                //添加我们需要测试的Fragment
                mTransaction.replace(R.id.fl_blank,new Fragment01(),"frag01");

                break;
            case R.id.fragment02:
                mTransaction.replace(R.id.fl_blank,new Fragment02());

                break;
            case R.id.fragment03:
                mTransaction.replace(R.id.fl_blank,new Fragment03());

                break;
            case R.id.fragment04:
                mTransaction.replace(R.id.fl_blank,new Fragment04());

                break;
        }

        mTransaction.commit();
    }


    public void sendMassage(View v) {
        Fragment01 frag01 = (Fragment01) mFragmentManager.findFragmentByTag("frag01");
        frag01.setText("K.0");
    }

    public void setSendMassage(String string) {
        mSendMassage.setText(string);
    }



}
