package com.thinkgem.jeesite.collections.list;

import java.util.*;

/**
 * Created by Thinkpad on 17/03/22.
 */
public class ListTest {
    /**
    * List实现类总结
     * 一、线程安全性：
     *    线程安全：Vector 、 Stack
     *    线程不安全： ArrayList 、 LinkedList
     *
     * 二、实现方式：
     *    双向链表：LinkedList
     *    数组：ArrayList 、 Vector 、 Stack
     *
     *三、容量拓展方面：
     *    由于ArrayList和Vector（Stack继承自Vector，添加几个方法）使用数组实现，当数组长度不够时，其内部会创建一个更大的
     *    数组，将原数组中的数据拷贝至新数组中。
     *
     *    * */

    public static void main(String[] args) {
        /*线程不安全*/
        List<String> linkedList = new LinkedList<String>();
        linkedList.add("LinkedList Test1");
        linkedList.add("LinkedList Test2");
        linkedList.add("LinkedList Test3");
        linkedList.add("LinkedList Test4");
        linkedList.add("LinkedList Test5");
        System.out.println(linkedList.get(0));

        System.out.println("分割-------------------------------------LinkedList-------------------------------------");
        /*线程不安全*/
        List<String> arrayList = new ArrayList<String>();
        arrayList.add("ArrayList Test1");
        arrayList.add("ArrayList Test2");
        arrayList.add("ArrayList Test3");
        arrayList.add("ArrayList Test4");
        arrayList.add("ArrayList Test5");
        System.out.println(arrayList.get(0));

        System.out.println("分割-------------------------------------ArrayList--------------------------------------");

        /*线程安全*/
        List vector  = new Vector();
        vector.add("Vector Test1");
        vector.add("Vector Test2");
        vector.add("Vector Test3");
        vector.add("Vector Test4");
        vector.add("Vector Test5");
        System.out.println(vector.get(0));

        System.out.println("分割-------------------------------------ArrayList--------------------------------------");

        /**
        * Stack继承自数组，添加相关方法
        * */
        List stack  = new Stack();
        stack.add("Stack Test1");
        stack.add("Stack Test2");
        stack.add("Stack Test3");
        stack.add("Stack Test4");
        stack.add("Stack Test5");
        System.out.println(stack.get(0));
    }
}
