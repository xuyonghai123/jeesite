package com.thinkgem.jeesite.test;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Thinkpad on 17/03/14.
 */
public class Array {
    public static void main(String[] args) {
        int [][] num = new int[3][3];
        num [0][0] = 1;
        num [0][1] = 2;
        num [0][2] = 3;

        num [1][0] = 4;
        num [1][1] = 5;
        num [1][2] = 6;

        num [2][0] = 7;
        num [2][1] = 8;
        num [2][2] = 9;

        String  ars=  "[[/dev/vda1, 15G, 3.4G, 11G, 24%, /], [devtmpfs, 361M, 0, 361M, 0%, /dev], [tmpfs, 371M, 0, 371M, 0%, /dev/shm], [tmpfs, 371M, 47M, 324M, 13%, /run], [tmpfs, 371M, 0, 371M, 0%, /sys/fs/cgroup], [tmpfs, 75M, 0, 75M, 0%, /run/user/0]] ";
        List list = Arrays.asList(ars);
        System.out.println(list.size());
        System.out.println("num:"+num);
    }
}
