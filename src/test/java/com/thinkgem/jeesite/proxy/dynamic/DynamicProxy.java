package com.thinkgem.jeesite.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by Thinkpad on 17/04/21.
 **/
public class DynamicProxy  implements InvocationHandler{
    private Object object;
    public DynamicProxy(Object obj) {
        this.object=obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("动态代理前置内容");
        method.invoke(object,args);
        System.out.println("动态代理后置内容");
        return null;
    }
}
