package com.aha.aha.ue.frag;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.aha.aha.R;
import com.hiber.hiber.RootFrag;

import butterknife.BindView;

/*
 * Created by Administrator on 2021/03/019.
 */
public class Frag_privacy extends RootFrag {


    @BindView(R.id.rl_privacy_bg)
    ImageView rlPrivacyBg;// 背景
    @BindView(R.id.tv_privacy_title)
    TextView tvPrivacyTitle;// 标题
    @BindView(R.id.tv_privacy_des)
    TextView tvPrivacyDes;// 描述
    @BindView(R.id.iv_privacy_back)
    ImageView ivPrivacyBack;// 回退

    @Override
    public int onInflateLayout() {
        return R.layout.frag_privacy;
    }

    @Override
    public void onNexts(Object o, View view, String s) {

    }

    @Override
    public boolean onBackPresss() {
        return false;
    }
}
