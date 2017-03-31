package com.thinkgem.jeesite.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by Thinkpad on 17/03/31.
 **/
public class TestMap {
    public static void main(String[] args){
//        System.out.println("asdasdasd");
        ExecutorService executor= Executors.newCachedThreadPool();
        for(int i=0;i<5;i++) {
            executor.submit(new TestMap1());
        }
    }
}

class TestMap1 implements Runnable{

    @Override
    public void run() {
//        String hashMap1="[ifInRate:0.0, ifInDiscardsRate:0.0, ifInErrorsRate:0.0, ifOutRate:0.0, ifOutDiscardsRate:0.0, ifOutErrorsRate:0.0]";
//        HashMap hashMap = new HashMap();
//        hashMap.put("ifInRate",0.0);
//        hashMap.put("ifInDiscardsRate",0.0);
//        hashMap.put("ifInErrorsRate",0.0);
//        hashMap.put("ifOutRate",0.0);
//        hashMap.put("ifOutDiscardsRate",0.0);
//        hashMap.put("ifOutErrorsRate",0.0);
        MapInit mapInit = new MapInit();
        System.out.println("Map:"+mapInit.hashMap.toString());
        HashMap hashMap=mapInit.hashMap;
        for (Object key : hashMap.keySet())
            {
//                System.out.println("Key = [" + key + "]");
//                System.out.println("Value = [" + hashMap.get(key)+"]");
            }
    }


}

class MapInit{
    LinkedHashMap hashMap = new LinkedHashMap();
//    Map map = new LinkedHashMap()
    MapInit(){

        hashMap.put("ifInRate",0.0);
        hashMap.put("ifInDiscardsRate",0.0);
        hashMap.put("ifInErrorsRate",0.0);
        hashMap.put("ifOutRate",0.0);
        hashMap.put("ifOutDiscardsRate",0.0);
        hashMap.put("ifOutErrorsRate",0.0);
    }
}