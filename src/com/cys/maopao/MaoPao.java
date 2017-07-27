package com.cys.maopao;

/**
 * Created by 跃 on 2017/7/15.
 */
public class MaoPao {
    public static void main(String[] args) {

        int arr[]={1,3,2,1,5,7,3,0};
      sortMaoPao(arr);
       for (int i :arr ) {
           System.out.println(i);
       }
    }
    public static void sortMaoPao(int []arr){
        for(int i=0;i<arr.length-1;i++){
            for (int j=0;j<arr.length-i-1;j++){
                if(arr[j]>=arr[j+1]){
                    int temp;
                    temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }
}
