package com.thinkgem.jeesite.test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Thinkpad on 17/03/14.
 */
 class Array {
    public static void main(String[] args) {
        int [][] num = new int[3][3];
        num [0][0] = 1;
        num [0][1] = 2;
        num [0][2] = 3;

        num [1][0] = 4;
        num [1][1] = 5;
        num [1][2] = 6;

        num [2][0] = 7;
        num [2][1] = 8;
        num [2][2] = 9;
        int[] arr1= new int [] {1,2,3,4,5};

        Map[] map = new Map[5];
        map[0] =new HashMap();
        map[0].put("a","123");

//        List list = Arrays.asList(ars);
//        System.out.println(list.size());
        System.out.println("map:"+Arrays.toString(map));
    }
}
