package com.example.embedded;

import org.apache.catalina.startup.Tomcat;

import java.io.File;

/**
 * TomcatLauncher
 *
 * @author: Xugang Song
 * @create: 2020/11/11
 */
public class TomcatLauncher {
    public static void main(String[] args) throws Exception {
        Tomcat tomcat = new Tomcat();
        tomcat.setPort(8080);
        tomcat.addWebapp("", new File("src/main/").getAbsolutePath());
        tomcat.getConnector();
        tomcat.start();
        tomcat.getServer().await();
    }
}
