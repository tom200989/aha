package com.aha.aha.ue.frag;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.aha.aha.R;
import com.hiber.hiber.RootFrag;

import butterknife.BindView;

/*
 * Created by Administrator on 2021/03/019.
 */
public class Frag_guide3 extends RootFrag {

    @BindView(R.id.rl_bg3)
    RelativeLayout rlBg3;// 背景容器
    @BindView(R.id.iv_bg3)
    ImageView ivBg3;// 背景
    @BindView(R.id.iv_now3)
    ImageView ivNow3;// 图标
    @BindView(R.id.iv_coffee3)
    ImageView ivCoffee3;// 图标
    @BindView(R.id.bt_come3)
    Button btCome3;// 按钮

    @Override
    public int onInflateLayout() {
        return R.layout.frag_guide3;
    }

    @Override
    public void onNexts(Object o, View view, String s) {

    }

    @Override
    public boolean onBackPresss() {
        return false;
    }
}
