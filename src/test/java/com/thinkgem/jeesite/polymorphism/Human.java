package com.thinkgem.jeesite.polymorphism;

/**
 * Created by Thinkpad on 17/04/07.
 **/
public class Human {
    Home myHome;
    public void goHome()
    {
        //在回家的路上
        myHome.openDoor();
        //看电视
    }
    public static void main(String args[])
    {
        Human me = new Human();
        while(true)
        {
            //上学
            //吃饭
            me.goHome();
        }
    }
}
