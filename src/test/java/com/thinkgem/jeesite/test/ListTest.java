package com.thinkgem.jeesite.test;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Thinkpad on 17/03/22.
 */
public class ListTest {
    public static void main(String[] args) {
        listadd();
    }

    public static List listadd(){
        List<String> list = new LinkedList<String>();
        list.add("11111111");
        list.add("22222222");
        System.out.println(list);
        return list;
    }


}
