package com.aha.aha.ue.frag;

import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.aha.aha.R;
import com.hiber.hiber.RootFrag;

import butterknife.BindView;

/*
 * Created by Administrator on 2021/03/019.
 */
public class Frag_guide1 extends RootFrag {

    @BindView(R.id.rl_bg1)
    RelativeLayout rlBg;// 底版
    @BindView(R.id.iv_bg1)
    ImageView ivBg;// 背景
    @BindView(R.id.iv_hi1)
    ImageView ivHi;// hi
    @BindView(R.id.tv_nice_to1)
    TextView tvNiceTo;// 很高兴
    @BindView(R.id.iv_smaile1)
    ImageView ivSmaile;// 笑脸
    @BindView(R.id.tv_first_met1)
    TextView tvFirstMet;// 首次见面
    @BindView(R.id.tv_first_met1_2)
    TextView tvFirstMet2;// 恭候多时
    @BindView(R.id.iv_next1)
    ImageView ivNext;// 下一步

    @Override
    public int onInflateLayout() {
        return R.layout.frag_guide1;
    }

    @Override
    public void onNexts(Object o, View view, String s) {

    }

    @Override
    public boolean onBackPresss() {
        return false;
    }
}
