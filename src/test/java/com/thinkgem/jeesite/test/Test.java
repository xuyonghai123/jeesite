package com.thinkgem.jeesite.test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test {
    Array array = new Array();
	public static void main(String[] args) {
        ExecutorService executor= Executors.newCachedThreadPool();
        for(int i=0;i<5;i++) {
            executor.submit(new Test123());
        }
	}
	void sott(){
	    System.out.println("1111111111");
    }

	class TestClass{
        void asd(){
            sott();
        }
    }

}
class Test123 implements Runnable{

    @Override
    public void run() {
        System.out.println("asdasdasd");
    }
}