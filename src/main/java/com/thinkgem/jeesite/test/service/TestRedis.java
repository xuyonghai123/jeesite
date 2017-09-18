package com.thinkgem.jeesite.test.service;

import com.thinkgem.jeesite.common.utils.JedisUtils;
import redis.clients.jedis.Jedis;

/**
 * Created by Thinkpad on 17/09/05.
 **/
public class TestRedis {

    public static void main(String[] args) {
        Jedis jedis = JedisUtils.getResource();
        jedis.set("testkey","testvalue");
    }
}
