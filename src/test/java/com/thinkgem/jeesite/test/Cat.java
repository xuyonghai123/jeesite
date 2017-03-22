package com.thinkgem.jeesite.test;

import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by Thinkpad on 17/03/09.
 */
public class Cat extends Animal {
    int num = 88;
    static int age = 90;
    String name = "tomcat";

    @Override
    public void eat(){
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        System.out.println("猫吃饭");
    }

    public static void sleep(){
        System.out.println("猫在睡觉");
    }

    public void catchMouse(){
        System.out.println("猫在抓老鼠");
    }

}
