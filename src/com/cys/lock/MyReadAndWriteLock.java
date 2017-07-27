package com.cys.lock;

import java.util.concurrent.locks.ReentrantReadWriteLock;

public class MyReadAndWriteLock {
    private ReentrantReadWriteLock rrw = new ReentrantReadWriteLock();//里面可是设置TRUE为公平竞争默认FALSE非公平竞争
 private    Person person;
    public MyReadAndWriteLock(Person person){
        this.person=person;
    }
    public void getThreadNameWrite(Thread thread){
        rrw.writeLock().lock();//获得写锁
        try {
            for(int i=0;i<100;i++){
                System.out.println("当前线程"+thread.getName()+"正在写操作----"+i);
                person.setName("旺财1");
                person.setAge(11+i);
                System.out.println("修改为旺财1+++11---"+person.toString());


            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            rrw.writeLock().unlock();//释放读写锁
        }
    }

    public void getTheadNameRead(Thread thread){
        rrw.readLock().lock();
        try {
            for(int i=0;i<1000;i++){
                System.out.println(thread.getName()+"正在读操作操作----"+i);

                System.out.println("读操作---"+person.toString());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            rrw.readLock().unlock();
        }
    }

}
