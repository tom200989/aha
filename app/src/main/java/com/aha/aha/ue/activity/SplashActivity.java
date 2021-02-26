package com.aha.aha.ue.activity;

import com.aha.aha.BuildConfig;
import com.aha.aha.R;
import com.aha.aha.ue.frag.Frag_test;
import com.hiber.bean.RootProperty;
import com.hiber.hiber.RootMAActivity;

public class SplashActivity extends RootMAActivity {

    private Class[] frags = {Frag_test.class,};

    @Override
    public RootProperty initProperty() {
        // 创建RootProperty对象
        RootProperty rootProperty = new RootProperty();
        // 指定状态栏颜色
        rootProperty.setColorStatusBar(R.color.colorPrimary);
        // 指定Activity中的Fragment容器ID
        rootProperty.setContainId(R.id.fl_contain);
        // 指定你要在本Activity加载的Fragment数组
        rootProperty.setFragmentClazzs(frags);
        // 是否设置全屏
        rootProperty.setFullScreen(true);
        // 指定你的Activity:layout
        rootProperty.setLayoutId(R.layout.activity_splash);
        // 是否缓存本Activity, 建议为false, 如果设置为true可能会导致Fragment内存泄漏问题
        rootProperty.setSaveInstanceState(false);
        // 设置包名
        rootProperty.setPackageName(BuildConfig.APPLICATION_ID);
        
        /* 以下为可选 */
        // // 指定状态栏为沉浸式
        // rootProperty.setStatusbarImmerse(true);
        // // 指定状态栏透明度
        // rootProperty.setStatusbarAlpha(0.5f);
        // // 此处是设置渐变色 或 自定义drawable
        // GradientBean gradientBean = new GradientBean();
        // gradientBean.setDrawable(ContextCompat.getDrawable(this, R.drawable.gr_bg));
        // gradientBean.setOrientation(GradientDrawable.Orientation.LEFT_RIGHT);
        // gradientBean.setColors(new int[]{R.color.colorPrimary, R.color.colorAccent});
        // rootProperty.setGradientStatusBar(gradientBean);
        
        return rootProperty;
    }

    @Override
    public void onNexts() {

    }

    @Override
    public boolean onBackClick() {
        return false;
    }
}
