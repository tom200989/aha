package com.aha.aha.ue.frag;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.aha.aha.R;
import com.hiber.hiber.RootFrag;

import butterknife.BindView;

/*
 * Created by Administrator on 2021/03/019.
 */
public class Frag_verify extends RootFrag {


    @BindView(R.id.rl_bg_verify)
    ImageView rlBgVerify;// 背景
    @BindView(R.id.iv_verify_back)
    ImageView ivVerifyBack;// 回退
    @BindView(R.id.iv_verify_logo)
    ImageView ivVerifyLogo;// 图标
    @BindView(R.id.iv_verify_lock)
    ImageView ivVerifyLock;// 图标
    @BindView(R.id.rl_verify_input)
    RelativeLayout rlVerifyInput;// 输入框容器
    @BindView(R.id.et_verify_number)
    EditText etVerifyNumber;// 输入框
    @BindView(R.id.iv_verify_numberIcon)
    ImageView ivVerifyNumberIcon;// 输入框图标
    @BindView(R.id.v_verify_phoneLine)
    View vVerifyPhoneLine;// 输入框底线
    @BindView(R.id.bt_verify)
    Button btVerify;// 按钮

    @Override
    public int onInflateLayout() {
        return R.layout.frag_verify;
    }

    @Override
    public void onNexts(Object o, View view, String s) {

    }

    @Override
    public boolean onBackPresss() {
        return false;
    }
}
