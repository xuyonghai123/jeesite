package com.thinkgem.jeesite.collections.map;

import java.util.*;

/**
 * Created by Thinkpad on 17/03/22.
 */
public class MapTest {


    public static void main(String[] args) {
//        Map hashMap = new HashMap();
        Map linkedHashMap = new LinkedHashMap();
        Map hashtable = new Hashtable();
        Map  treeMap = new TreeMap();
        Map weakHashMap = new WeakHashMap();

//        hashMap.put("111","123");
//        hashMap.put("222","234");
//        System.out.println(hashMap);


        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i=0;i<20;i++){
            list.add(i);
        }
        for(int i=15;i<25;i++){//重复的元素会被再次插入
            list.add(i);
        }
        /*按照插入的顺序输出，多次试验输出结果都是按照插入的顺序*/
        System.out.println("list = "+list);//输出格式如list = [1, 2, 3, 4,]

        /*2. Set*/
        HashSet<Integer> set = new HashSet<Integer>();
        for(int i=0;i<20;i++){
            set.add(i);
        }
        for(int i=15;i<25;i++){//重复的元素不会被再次插入
            set.add(i);
        }
        /*不是按照插入的顺序输出，多次试验输出结果都是可能不同*/
        System.out.println("set = "+set);//set = [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 17, 16, 19, 18, 21, 20, 23, 22, 24]

        Map<String,List> hashMap = new HashMap<String,List>();
        hashMap.put("q",list);
        hashMap.put("w",list);
        hashMap.put("e",list);

        /*3. Map*/
        HashMap<Character,Map> map = new HashMap<Character, Map>();
        map.put('a', hashMap);
        map.put('b', hashMap);
        map.put('c', hashMap);
        /*输出的时候不是按照插入的顺序，所以多次运行输出的结果可能不一样*/
        System.out.println("map = "+map);//map = {b=2, c=3, a=1}
    }
}
