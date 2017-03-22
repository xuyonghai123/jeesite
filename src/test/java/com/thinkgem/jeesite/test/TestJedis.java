package com.thinkgem.jeesite.test;

import redis.clients.jedis.Jedis;

/**
 * Created by Thinkpad on 17/03/06.
 */
public class TestJedis {
    public static void main(String[] args){
        Jedis jedis = new Jedis("127.0.0.1", 6379);
        jedis.set("name","xinxin");
//        System.out.println(jedis.get("name"));
//
//        jedis.append("name", " is my lover"); //拼接
//        System.out.println(jedis.get("name"));
//        jedis.del("name");  //删除某个键
//        System.out.println(jedis.get("name"));
//        //设置多个键值对
//        jedis.mset("name","liuling","age","23","qq","476777XXX");
//        jedis.incr("age"); //进行加1操作
//        System.out.println(jedis.get("name") + "-" + jedis.get("age") + "-" + jedis.get("qq"));
    }
}
