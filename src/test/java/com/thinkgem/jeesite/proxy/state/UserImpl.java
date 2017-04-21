package com.thinkgem.jeesite.proxy.state;

/**
 * Created by Thinkpad on 17/04/21.
 **/
public class UserImpl implements Iuser {

    @Override
    public void eat(String s) {
        System.out.println("我要吃"+s);
    }
}
