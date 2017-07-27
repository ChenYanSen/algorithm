package com.cys.cloneandcpy;
//最佳的懒汉模式改进化
public class LanHanDemo {
    private LanHanDemo(){}
    private static volatile LanHanDemo lanHanDemo;//volatile 保证啦数据改变后会立刻被更新到内存保证其他线程访问时读到更新过得值
    public static LanHanDemo getInstance(){
        if(null!=lanHanDemo){
            synchronized (LanHanDemo.class){
                if(null!=lanHanDemo)
                    lanHanDemo=new LanHanDemo();
            }
        }
        return lanHanDemo;
    }

}
