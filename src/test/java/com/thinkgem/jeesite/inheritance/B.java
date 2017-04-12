package com.thinkgem.jeesite.inheritance;

import javax.servlet.http.HttpServletRequest;
import java.net.HttpRetryException;

/**
 * Created by Thinkpad on 17/04/11.
 **/
public class B extends  A {
   static {
       System.out.println("B的静态代码块");
   }

    public B() {
        System.out.println("i am B");
    }

    public static void main(String[] args) {
        B b = new B();
        b=new B();
    }
}
