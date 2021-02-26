package com.aha.aha.utils;

import com.bmobwork.bmobwork.log.Legg;

/*
 * Created by Administrator on 2021/02/026.
 */
public class PrintLog {

    public static String TAG = "aha_apk";

    /**
     * 信息打印
     *
     * @param msg 内容
     */
    public static void i(String msg) {
        Legg.i(TAG, TAG + " --> " + msg);
    }

    /**
     * 信息打印
     *
     * @param msg 内容
     */
    public static void e(String msg) {
        Legg.e(TAG, TAG + " --> " + msg);
    }

    /**
     * 信息打印
     *
     * @param msg 内容
     */
    public static void w(String msg) {
        Legg.w(TAG, TAG + " --> " + msg);
    }

    /**
     * 信息打印
     *
     * @param msg 内容
     */
    public static void v(String msg) {
        Legg.v(TAG, TAG + " --> " + msg);
    }
}
