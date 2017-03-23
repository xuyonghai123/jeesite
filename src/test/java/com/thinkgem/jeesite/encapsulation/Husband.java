package com.thinkgem.jeesite.encapsulation;

/**
 * Created by Thinkpad on 17/03/23.
 */
public class Husband {
    /*
     * 对属性的封装
     * 一个人的姓名、性别、年龄、妻子都是这个人的私有属性
     */
    private String name;
    private int age;
    private  String sex;
    private Wife wife;

    /*
     * setter()、getter()是该对象对外开发的接口
    */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Wife getWife() {
        return wife;
    }

    public void setWife(Wife wife) {
        this.wife = wife;
    }
}
