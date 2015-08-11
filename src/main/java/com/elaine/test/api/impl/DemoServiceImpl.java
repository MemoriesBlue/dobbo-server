package com.elaine.test.api.impl;

import com.elaine.test.api.DemoService;

/**
 * Created by jianlan on 15-8-4.
 */
public class DemoServiceImpl implements DemoService {
    public String msg(String msg) {
        System.out.println("a consumer called! msg:" + msg);
        return "provider: " + msg;
    }
}
