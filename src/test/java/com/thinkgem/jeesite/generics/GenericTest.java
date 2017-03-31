package com.thinkgem.jeesite.generics;

import java.io.Serializable;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Thinkpad on 17/03/23.
 **/
public class GenericTest implements Serializable  {
    public static void main(String[] args) {
        List<String> name = new ArrayList<String>();
        List<Integer> age = new ArrayList<Integer>();
        List<Number> number = new ArrayList<Number>();

        name.add("icon");
        age.add(18);
        number.add(314);

//        getData(name);
        try {
            getData(age);
            getData(number);
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            System.out.println("finally:always performed");
        }

    }

    public static void getData(List<? extends Number> data) throws Exception {
        System.out.println("data :" + data.get(0));
    }
}
