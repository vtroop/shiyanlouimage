package com.service.impl;

import com.service.TestAop;

/**
 * Created by Evilina on 2016/9/6.
 */
public class TestAopImpl implements TestAop{
    @Override
    public void sayLog() {
        System.out.println("the mission");
    }
}
