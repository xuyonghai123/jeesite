package com.thinkgem.jeesite.collections.list;

import java.util.*;

/**
 * Created by Thinkpad on 17/03/22.
 */
public class ListTest {
    List<String> linkedList = new LinkedList<String>();
    List<String> arrayList = new ArrayList<String>();
    List vector  = new Vector();
    List stack  = new Stack();
    public static void main(String[] args) {
        List<String> linkedList = new LinkedList<String>();
        linkedList.add("qweqw");
        linkedList.add("asdasd");
        linkedList.add("zxczxc");
        linkedList.add("sdfsdf");
        System.out.println(linkedList);
    }

}
