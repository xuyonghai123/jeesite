package com.thinkgem.jeesite.inheritance;

import com.sun.tools.internal.xjc.reader.xmlschema.bindinfo.BIConversion;

/**
 * Created by Thinkpad on 17/04/11.
 **/
public class A {
    static{
        System.out.println("A的静态代码块");
    }
    public A() {
        System.out.println("i am  A");
    }
}
