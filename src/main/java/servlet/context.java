package servlet;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Created by Thinkpad on 17/04/12.
 **/
public class context {
    public static void main(String[] args) {
        ApplicationContext ac = new FileSystemXmlApplicationContext("applicationContext.xml");

    }
}
