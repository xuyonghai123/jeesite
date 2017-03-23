package com.thinkgem.jeesite.generics;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Thinkpad on 17/03/23.
 **/
public class GenericTest {
    public static void main(String[] args) {
        List<String> name = new ArrayList<String>();
        List<Integer> age = new ArrayList<Integer>();
        List<Number> number = new ArrayList<Number>();

        name.add("icon");
        age.add(18);
        number.add(314);

//        getData(name);
        getData(age);
        getData(number);
    }

    public static void getData(List<? extends Number> data) {
        System.out.println("data :" + data.get(0));
    }
}
