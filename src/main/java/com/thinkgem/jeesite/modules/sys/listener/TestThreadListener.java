package com.thinkgem.jeesite.modules.sys.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * Created by Thinkpad on 17/06/26.
 **/
public class TestThreadListener  implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        while (1>0) System.out.println("监听器正在监听中。。。。。。。。。。。。");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {

    }
}
