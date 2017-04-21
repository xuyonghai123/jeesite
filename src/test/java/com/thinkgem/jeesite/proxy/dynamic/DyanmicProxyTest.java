package com.thinkgem.jeesite.proxy.dynamic;

import com.thinkgem.jeesite.proxy.state.Iuser;
import com.thinkgem.jeesite.proxy.state.UserImpl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * Created by Thinkpad on 17/04/21.
 **/
public class DyanmicProxyTest {
    public static void main(String[] args) {
        Iuser user= new UserImpl();
        InvocationHandler in = new DynamicProxy(user);
        Iuser proxy = (Iuser) Proxy.newProxyInstance(Iuser.class.getClassLoader(),new Class[]{Iuser.class},in);
        proxy.eat("香蕉");
    }
}
