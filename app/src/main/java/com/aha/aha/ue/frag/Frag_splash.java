package com.aha.aha.ue.frag;

import android.view.View;
import android.widget.TextView;

import com.aha.aha.R;
import com.aha.aha.widget.ProgressWidget;
import com.hiber.hiber.RootFrag;

import butterknife.BindView;

/*
 * Created by Administrator on 2021/03/019.
 */
public class Frag_splash extends RootFrag {

    @BindView(R.id.pg)
    ProgressWidget pg;// 进度条
    @BindView(R.id.tv_pg)
    TextView tvPg;// 进度文本

    @Override
    public int onInflateLayout() {
        return R.layout.frag_splash;
    }

    @Override
    public void onNexts(Object o, View view, String s) {
        pg.setPaintColor(getRootColor(R.color.colorTheme));
        pg.setMax(100);
        pg.setProgress(50);
        tvPg.setText(String.format(getRootString(R.string.splash_updating), 50));
    }

    @Override
    public boolean onBackPresss() {
        return false;
    }
}
