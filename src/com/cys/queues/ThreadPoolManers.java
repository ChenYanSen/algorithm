package com.cys.queues;


import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.*;

public class ThreadPoolManers {
    private static ThreadPoolManers tpm=new ThreadPoolManers();
    //线程池维护的最少数量
    private final static int CORE_POOL_SIZE=4;
    //线程池维护的最大数量
    private final static int MAX_POOL_SIZE=10;
    //线程池维护所允许的空闲时间
    private final static int KEEP_ALIVE_TIME=0;
    //线程池所使用的缓冲池大小
    private final static int WORK_QUEUE_SIZE=10;
    //消息缓冲队列
    Queue<String > msgQueue=new LinkedList<String>();
    private boolean hasMoreAcquire(){
        return !msgQueue.isEmpty();
    }
    //访问线程池的调度线程
    //查看是否有待定请求，如果有创建一个新的线程添加到线程池
    final Runnable accessBufferThread=new Runnable() {
        @Override
        public void run() {
                if(hasMoreAcquire()){
                    String msg=msgQueue.poll();
                    Runnable task=new AccessDBThread(msg);

                }
        }
    };
    final RejectedExecutionHandler handler=new RejectedExecutionHandler() {
        @Override
        public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {
            System.out.println(((AccessDBThread)r).getMsg()+"消息放入队列中重新等待执行");
            msgQueue.offer(((AccessDBThread)r).getMsg());
        }
    };
    //管理数据库线程
    final ThreadPoolExecutor threadPool=new ThreadPoolExecutor(CORE_POOL_SIZE,MAX_POOL_SIZE,KEEP_ALIVE_TIME, TimeUnit.SECONDS,new ArrayBlockingQueue<Runnable>(WORK_QUEUE_SIZE),this.handler);
    //调度线程池
    final ScheduledExecutorService schedule=Executors.newScheduledThreadPool(100);
    final ScheduledFuture taskHandler=schedule.scheduleAtFixedRate(accessBufferThread,0,1,TimeUnit.SECONDS);
    public static ThreadPoolManers newInstance(){
        return tpm;
    }
    private ThreadPoolManers(){}
    public void addLogMsg(String msg){
        Runnable task=new AccessDBThread(msg);
        threadPool.execute(task);
    }
}
