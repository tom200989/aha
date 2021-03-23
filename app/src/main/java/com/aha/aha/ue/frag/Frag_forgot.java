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
public class Frag_forgot extends RootFrag {


    @BindView(R.id.rl_bg_forgot)
    ImageView rlBgForgot;// 背景
    @BindView(R.id.iv_forgot_back)
    ImageView ivForgotBack;// 回退
    @BindView(R.id.iv_forgot_logo)
    ImageView ivForgotLogo;// 图标
    @BindView(R.id.iv_forgot_lock)
    ImageView ivForgotLock;// 图标
    @BindView(R.id.rl_forgot_phone)
    RelativeLayout rlForgotPhone;// 输入框容器
    @BindView(R.id.et_forgot_phone)
    EditText etForgotPhone;// 输入框
    @BindView(R.id.iv_forgot_phoneIcon)
    ImageView ivForgotPhoneIcon;// 输入框图标
    @BindView(R.id.v_forgot_phoneLine)
    View vForgotPhoneLine;// 输入框底线
    @BindView(R.id.bt_forgot)
    Button btForgot;// 按钮

    @Override
    public int onInflateLayout() {
        return R.layout.frag_forgot;
    }

    @Override
    public void onNexts(Object o, View view, String s) {

    }

    @Override
    public boolean onBackPresss() {
        return false;
    }
}
