package com.aha.aha.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.widget.Button;

@SuppressLint("AppCompatCustomView")
public class ProgressWidget extends Button {

    // 0.声明参数
    private float max = 100;// 最大值
    private float progress = 0;// 当前进度
    private int paintColor = Color.YELLOW;// 进度颜色

    // 2.声明两个构造方法, 参数少的调用参数多的构造.
    public ProgressWidget(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    public ProgressWidget(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public ProgressWidget(Context context) {
        this(context, null, 0);
    }

    // 1.提供get,set方法供外界设置属性
    public float getMax() {
        return max;
    }

    // 2.0.对外提供方法设置最大值
    public void setMax(float max) {
        this.max = max;
    }

    // 2.1.对外提供方法获取进度值
    public float getProgress() {
        return progress;
    }

    // 2.2.对外提供方法设置进度值
    public void setProgress(float progress) {
        this.progress = progress;
        /* 注意:此处一定要使用Invalidate()强制更新实时绘制 */
        invalidate();
    }

    // 2.3.对外提供方法获取画笔颜色
    public int getPaintColor() {
        return paintColor;
    }

    // 2.4.对外提供方法设置画笔颜色
    public void setPaintColor(int paintColor) {
        this.paintColor = paintColor;
    }

    // 3.重写onDraw方法
    @Override
    protected void onDraw(Canvas canvas) {

        // 3.1.计算比例
        float rate = progress / max;

        // 3.3.提供绘制矩形需要的参数
        float left = 0;
        float top = 0;
        float right = rate * getMeasuredWidth() * 1.0f;// 获取当前布局的宽度 --> 决定绘制的总宽度
        float bottom = getMeasuredHeight();// 获取当前布局的高度 --> 决定绘制的高度
        Paint paint = new Paint();

        // 3.5.调节画笔属性(颜色, 填充)
        paint.setColor(paintColor);
        paint.setStyle(Paint.Style.FILL);

        // 3.2.使用画布绘制矩形
        canvas.drawRect(left, top, right, bottom, paint);

        super.onDraw(canvas);
    }
}
