package com.thinkgem.jeesite.test;

/**
 * Created by Thinkpad on 17/03/09.
 */
class Demo_Test1 {
    public static void main(String[] args) {
        Animal am = new Cat();

        am.eat();
        am.sleep();
        am.run();
        //am.catchMouse();这里先注释掉，等会会说明
        //System.out.println(am.name);//这里先注释，待会说明
        System.out.println(am.num);
        System.out.println(am.age);
//        System.out.println("-----------------------------------------------");
//        Cat cat = (Cat) am;
//        cat.eat();
//        cat.sleep();
//        cat.run();
//        System.out.println(cat.num);
//        System.out.println(cat.age);
//        System.out.println(cat.name);
//        cat.catchMouse();
//        Animal animal = (Animal) cat;
//        System.out.println("-----------------------------------------------");
//        animal.eat();
//        animal.sleep();
//        animal.run();
    }
}