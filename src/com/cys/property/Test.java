package com.cys.property;

import java.io.*;
import java.util.Properties;

/**
 * Created by 跃 on 2017/4/25.
 */
public class Test {
    public static void main(String[] args) throws IOException {
        Properties properties=new Properties();
        InputStream is=Test.class.getClassLoader().getResourceAsStream("config.properties");
        //设置编码转换为字符流可读汉字
        InputStreamReader  inputStreamReader=new InputStreamReader(is,"gbk");
        properties.load(inputStreamReader);
        String name = properties.getProperty("name");
        System.out.println(name);
        Test test=new Test();
        test.show();
    }

    public void show() throws IOException {
        Properties properties=new Properties();
        InputStream is=this.getClass().getClassLoader().getResourceAsStream("config.properties");

        properties.load(is);
        String name = properties.getProperty("name");
        System.out.println(name);
    }
}
