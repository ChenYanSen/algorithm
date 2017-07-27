package com.cys.lock;

import java.util.Hashtable;
import java.util.concurrent.ConcurrentHashMap;

public class Test {
    public static void main(String[] args) {
        //对写分离锁
        Person person=new Person("小花",1);
        ConcurrentHashMap concurrentHashMap;
        Hashtable hashtable;
        MyReadAndWriteLock myWriteLock=new MyReadAndWriteLock(person);
       new Thread("写---write1----") {
            @Override
            public void run() {
              myWriteLock.getThreadNameWrite(Thread.currentThread());
            }
        }.start();
       new Thread("写-----write2---") {
            @Override
            public void run() {
              myWriteLock.getThreadNameWrite(Thread.currentThread());
            }
        }.start();
       new Thread("读--read1--------") {
            @Override
            public void run() {
                myWriteLock.getTheadNameRead(Thread.currentThread());
            }
        }.start();
       new Thread("读---read2---") {
            @Override
            public void run() {
                myWriteLock.getTheadNameRead(Thread.currentThread());
            }
        }.start();

    }
}
