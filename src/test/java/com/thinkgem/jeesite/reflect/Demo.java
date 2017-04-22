package com.thinkgem.jeesite.reflect;


/**
 * Created by Thinkpad on 17/04/23.
 **/
public class Demo {
    public Demo(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Demo() {
    }

    private int age;
    String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Demo{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}

/**
 1,通过反射获取类的所有构造器
 1,通过反射获取类的所有实现的接口
 1,通过反射获取类的父类
 1,通过反射获取类的方法
 1,通过反射获取类的属性
* */

class Hello{
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Demo demo = new Demo();
        System.out.println("反射："+demo.getClass().getName());

        Class<?> demo1= null;
        Class<?> demo2= null;
        Class<?> demo3= null;

        demo1 = Class.forName("com.thinkgem.jeesite.reflect.Demo");
        demo2 = new Demo().getClass();
        demo3 = Demo.class;

        System.out.println("类名称1："+demo1);
        System.out.println("类名称2："+demo2);
        System.out.println("类名称3："+demo3);

        Demo demo11=null;
        Demo demo12=null;
        Demo demo13=null;

        demo11= (Demo) demo1.newInstance();
        demo12= (Demo) demo2.newInstance();
        demo13= (Demo) demo3.newInstance();
        demo11.setAge(15);
        demo11.setName("x");
        demo12.setAge(16);
        demo12.setName("y");
        demo13.setAge(17);
        demo13.setName("z");

        System.out.println("---------------------------------------------------");
        System.out.println("demo11："+demo11.toString());
        System.out.println("demo12："+demo12.toString());
        System.out.println("demo13："+demo13.toString());


    }
}