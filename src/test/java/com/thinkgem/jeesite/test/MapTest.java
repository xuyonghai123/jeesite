package com.thinkgem.jeesite.test;

import java.util.*;

/**
 * Created by Thinkpad on 17/03/22.
 */
public class MapTest {
    Map hashMap = new HashMap();
    Map linkedHashMap = new LinkedHashMap();
    Map hashtable = new Hashtable();
    Map weakHashMap = new WeakHashMap();

    public static void main(String[] args) {
//       Map hashMap123 = new HashMap();
//        hashMap123.put("111","123");
//        hashMap123.put("222","234");
//        hashMap123.put("333","321");
//        hashMap123.put("444","231");
//        System.out.println(hashMap123);
        Map linkedHashMap123 = new LinkedHashMap();
        linkedHashMap123.put("123","234");
        System.out.println(linkedHashMap123);
    }
}
