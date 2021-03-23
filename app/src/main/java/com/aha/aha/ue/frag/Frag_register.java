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
public class Frag_register extends RootFrag {


    @BindView(R.id.rl_bg_reg)
    ImageView rlBgReg;// 背景
    @BindView(R.id.rl_bg_reg2)
    ImageView rlBgReg2;// 背景

    @BindView(R.id.rl_reg_username)
    RelativeLayout rlRegUsername;// 输入框容器
    @BindView(R.id.et_reg_username)
    EditText etRegUsername;// 输入框
    @BindView(R.id.iv_reg_userIcon)
    ImageView ivRegUserIcon;// 输入框图标
    @BindView(R.id.v_reg_userLine)
    View vRegUserLine;// 输入框底线

    @BindView(R.id.rl_reg_psd)
    RelativeLayout rlRegPsd;// 输入框容器 
    @BindView(R.id.et_reg_psd)
    EditText etRegPsd;// 输入框
    @BindView(R.id.iv_reg_psdIcon)
    ImageView ivRegPsdIcon;// 输入框图标
    @BindView(R.id.v_reg_psdLine)
    View vRegPsdLine;// 输入框底线

    @BindView(R.id.rl_reg_email)
    RelativeLayout rlRegEmail;// 输入框容器
    @BindView(R.id.et_reg_email)
    EditText etRegEmail;// 输入框
    @BindView(R.id.iv_reg_emailIcon)
    ImageView ivRegEmailIcon;// 输入框图标
    @BindView(R.id.v_reg_emailLine)
    View vRegEmailLine;// 输入框底线

    @BindView(R.id.bt_reg)
    Button btReg;// 注册按钮

    @BindView(R.id.bt_back)
    ImageView btBack;// 回退按钮

    @Override
    public int onInflateLayout() {
        return R.layout.frag_register;
    }

    @Override
    public void onNexts(Object o, View view, String s) {

    }

    @Override
    public boolean onBackPresss() {
        return false;
    }
}
