package com.thinkgem.jeesite.equals;

/**
 * Created by Thinkpad on 17/09/15.
 **/
public class Test{
        public static void main(String[] args) {

            String str1 = new String("hello");
            String str2 = new String("hello");
            String str3 = "hello";
            String str4 = str1;
            int v;
            char a;
            char c = 'a'+'b';
            System.out.println(str1.equals(str3));
            System.out.println(str2.equals(str3));
            System.out.println(str1.equals(str2));
            System.out.println("------------------");
            System.out.println(str1 == str3);
            System.out.println(str2 == str3);
            System.out.println(str1 == str2);
            System.out.println(str1 == str4);



            System.out.println("------------------");
            Test2 test1 = new Test2();
            Test2 test2 = new Test2();
            Test2 test3 = test2;
            System.out.println("------------------");
            System.out.println(test1.equals(test2));
            System.out.println(test1 == test2);
            System.out.println(test2.equals(test3));
            System.out.println(test2 == test3);

        }
}
