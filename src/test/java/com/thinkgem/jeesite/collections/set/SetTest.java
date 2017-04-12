package com.thinkgem.jeesite.collections.set;

import java.util.*;

/**
 * Created by Thinkpad on 17/03/22.
 */
public class SetTest {



    public static void main(String[] args) {
        Set enumSet = EnumSet.noneOf(Student.class);
        Set hashSet = new HashSet();
        Set linkHashSet = new LinkedHashSet();
        Set treeSet = new TreeSet();
        int a=10;
        hashSet.add(1);
        hashSet.add(4);
        hashSet.add(2);
        hashSet.add(3);

        linkHashSet.add(1);
        linkHashSet.add(3);
        linkHashSet.add(4);
        linkHashSet.add(2);

        Iterator it = linkHashSet.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        linkHashSet.add(1);
        System.out.println("hashSet:"+linkHashSet);
    }

    enum Student {
        ROBIN("robin"),
        HARRY("harry",40),
        ROBBIE("robbie");
        String name;
        int age;
        private Student(String name) {
            this(name,0);
        }
        private Student(String name,int age) {
            this.name=name;
            this.age=age;
        }
    }
}
