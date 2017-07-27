package com.cys.queues;

public class AccessDBThread implements Runnable {
    private String msg;
    public AccessDBThread(){}
    public AccessDBThread(String msg){
        this.msg=msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public void run() {
        System.out.println("Added the message"+msg+"into the Database");
    }
}
