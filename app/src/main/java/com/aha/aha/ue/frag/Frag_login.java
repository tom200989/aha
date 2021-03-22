package com.aha.aha.ue.frag;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.aha.aha.R;
import com.hiber.hiber.RootFrag;

import butterknife.BindView;

/*
 * Created by Administrator on 2021/03/019.
 */
public class Frag_login extends RootFrag {


    @BindView(R.id.rl_bg_login)
    ImageView rlBgLogin;// 背景
    @BindView(R.id.iv_login_icon)
    ImageView ivLoginIcon;// 图标
    @BindView(R.id.et_login_username)
    EditText etLoginUsername;// 输入框
    @BindView(R.id.et_login_userIcon)
    ImageView etLoginUserIcon;// 输入框图标
    @BindView(R.id.et_login_psd)
    EditText etLoginPsd;// 输入框
    @BindView(R.id.et_login_psdIcon)
    ImageView etLoginPsdIcon;// 输入框图标
    @BindView(R.id.iv_login_checkIcon)
    ImageView ivLoginCheckIcon;// checkbox图标
    @BindView(R.id.tv_login_checkText)
    TextView tvLoginCheckText;// 记住密码
    @BindView(R.id.tv_login_toReg)
    TextView tvLoginToReg;// 去注册
    @BindView(R.id.bt_login)
    Button btLogin;// 登录按钮
    @BindView(R.id.tv_login_forgot)
    TextView tvLoginForgot;// 忘记密码
    @BindView(R.id.tv_login_privacy)
    TextView tvLoginPrivacy;// 隐私
    @BindView(R.id.tv_login_privacy2)
    TextView tvLoginPrivacy2;// 隐私

    @Override
    public int onInflateLayout() {
        return R.layout.frag_login;
    }

    @Override
    public void onNexts(Object o, View view, String s) {

    }

    @Override
    public boolean onBackPresss() {
        return false;
    }
}
