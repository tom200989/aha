package com.aha.aha.bean;

import cn.bmob.v3.BmobObject;

/*
 * Created by Administrator on 2021/02/026.
 */
public class TestBean extends BmobObject {
    private String test;

    public String getTest() {
        return test;
    }

    public TestBean setTest(String test) {
        this.test = test;
        return this;
    }
}
