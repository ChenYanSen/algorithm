package com.cys.queues;

public class TeskDriver {
    private ThreadPoolManers tpm=ThreadPoolManers.newInstance();
    public void sendMsg(String msg){
        tpm.addLogMsg(msg+"记录一条日志");
    }

    public static void main(String[] args) {
        for (int i=0;i<30;i++){
            new TeskDriver().sendMsg(Integer.toString(i));
        }
    }
}
