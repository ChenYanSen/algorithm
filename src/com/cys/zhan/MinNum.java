package com.cys.zhan;

import java.util.Stack;

/**
 * Created by 跃 on 2017/7/11.
 */
public class MinNum {
    public static void main(String[] args) {
         int []pushA={1,2,3,4,5};
         int []popA={3,5,4,2,1};
         boolean flag=IsPopOrder(pushA,popA);
        System.out.println(flag);
    }

    public static boolean IsPopOrder(int[] pushA, int[] popA) {
        if(popA.length!=pushA.length||popA.length==0||pushA.length==0)
            return false;
        Stack<Integer> stack=new Stack<>();
        //设置出站标志
        int popIndex=0;
       for (int i=0;i<pushA.length;i++){
              stack.push(pushA[i]);//元素进站
           while (!stack.isEmpty()&&stack.peek()==popA[popIndex]){
               System.out.println(stack.pop());
               popIndex++;
           }
       }
       boolean flag=stack.isEmpty();
        return stack.isEmpty();
    }
}
