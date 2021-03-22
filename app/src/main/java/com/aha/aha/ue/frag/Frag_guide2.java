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
public class Frag_guide2 extends RootFrag {


    @BindView(R.id.rl_bg2)
    RelativeLayout rlBg2;// 背景容器
    @BindView(R.id.iv_bg2)
    ImageView ivBg2;// 背景图
    @BindView(R.id.iv_cloud2)
    ImageView ivCloud2;// 云图标
    @BindView(R.id.iv_here2)
    ImageView ivHere2;// here图标
    @BindView(R.id.tv_smaile2)
    TextView tvSmaile2;// 描述
    @BindView(R.id.tv_first_met2)
    TextView tvFirstMet2;// 描述
    @BindView(R.id.tv_first_met2_2)
    TextView tvFirstMet22;// 描述
    @BindView(R.id.iv_next2)
    ImageView ivNext2;// 下一步

    @Override
    public int onInflateLayout() {
        return R.layout.frag_guide2;
    }

    @Override
    public void onNexts(Object o, View view, String s) {

    }

    @Override
    public boolean onBackPresss() {
        return false;
    }
}
