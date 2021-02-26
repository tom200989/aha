package com.aha.aha.ue.frag;

import android.view.View;
import android.widget.Button;

import com.aha.aha.R;
import com.aha.aha.bean.TestBean;
import com.aha.aha.utils.PrintLog;
import com.bmobwork.bmobwork.bean.User;
import com.bmobwork.bmobwork.helper.BmobDB;
import com.bmobwork.bmobwork.helper.BmobUr;
import com.hiber.hiber.RootFrag;

import butterknife.BindView;

/*
 * Created by Administrator on 2021/02/025.
 */
public class Frag_test extends RootFrag {

    @BindView(R.id.bt_login)
    Button bt_login;
    @BindView(R.id.bt_logout)
    Button bt_logout;
    @BindView(R.id.bt_save)
    Button bt_save;

    @Override
    public int onInflateLayout() {
        return R.layout.frag_test;
    }

    @Override
    public void onNexts(Object o, View view, String s) {
        bt_login.setOnClickListener(v -> {
            User user = new User();
            user.setUsername("maqianli");
            user.setPassword("123456");
            BmobUr ur = new BmobUr();
            ur.setOnLoginSuccessListener(user1 -> PrintLog.i("登录成功"));
            ur.setOnLoginFailedListener(() -> PrintLog.e("登录失败"));
            ur.login(user);
        });

        bt_logout.setOnClickListener(v -> {
            BmobUr ur = new BmobUr();
            ur.setOnLogoutSuccessListener(() -> PrintLog.i("登出成功"));
            ur.setOnLogoutFailedListener(() -> PrintLog.e("登出失败"));
            ur.logout();
        });

        bt_save.setOnClickListener(v -> {
            TestBean testBean = new TestBean();
            testBean.setTest("测试");
            BmobDB<TestBean> db = new BmobDB<TestBean>();
            db.setOnSaveOneSuccessListener(s1 -> PrintLog.i("保存成功"));
            db.setOnSaveOneFailedListener(() -> PrintLog.e("保存失败"));
            db.save(testBean);
        });
    }

    @Override
    public boolean onBackPresss() {
        return false;
    }
}
