package com.thinkgem.jeesite.test;

import java.util.UUID;

/**
 * Created by Thinkpad on 17/11/01.
 **/
public class Test2 {
    String uuid =  UUID.randomUUID().toString();
    int one = 1;
    int two = 2;
    int sum1 = 0;
    int sum2 = 0;

    void atest() {
        sum1 = +one;
        sum2 += two;
//        sum1 = +two;
//        sum2 += one;
        System.out.println(sum1);
        System.out.println(sum2);
    }

    public static void main(String[] args) {
        Test2 test2 = new Test2();
        test2.atest();
    }


}
