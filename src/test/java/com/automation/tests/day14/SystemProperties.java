package com.automation.tests.day14;

import org.testng.annotations.Test;

public class SystemProperties {
    @Test
    public void test(){
        //C:\Users\sptur\IdeaProjects\Fall2019Selenium1\pom.xml
        //System.getProperty("user.dir"+"/pom.xml"

        System.out.println(System.getProperty("user.dir"));
        System.out.println(System.getProperty("os.name"));
        System.out.println(System.getProperty("os.version"));
        System.out.println(System.getProperty("Java.home"));
        System.out.println(System.getProperty("Java.version"));
        System.out.println(System.getProperty("os.arch"));

        //flexible path to downloads folder
        //how we could specify the path for using teammeat
        //System.getProperty("user.name")+"/Downloads"  (this thing will find downloads folder for every computer)
        System.out.println(System.getProperty("user.home"));
        String pathToDownloads = System.getProperty("user.home")+"/Downloads";
        System.out.println(pathToDownloads);
        //this path will work for everyone
        //System.getProperty("user.home")returns path to the user folder and concatinate with downloads ,
        // so becomes a path to the downloads folder which is flexible and works with every computer
        //it is just a path(address) it doesn't do anything
        System.out.println(System.getProperty("user.name"));
        System.out.println(System.getProperty("os.arch"));
        //you can get details of  this properties java system properties.com(sysprop.com)
    }


}
