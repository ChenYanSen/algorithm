package com.cys.charu;

/**
 * Created by 跃 on 2017/7/10.
 * 冒泡排序最大的在下面
 */
public class Maopao {
    public static void main(String[] args) {
        int []arr={1,3,5,9,2,1,0,98,21};
     Maopao maopao=new Maopao();
     maopao.sortArray(arr);
     for (int i :arr ) {
         System.out.println(i);
     }
    }
    public void sortArray(int []arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
}
