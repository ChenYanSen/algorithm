package com.cys.charu;

/**
 * Created by 跃 on 2017/7/10.
 * 选择排序
 */
public class XuanZe {
    public static void main(String[] args) {
        int []arr={1,3,5,9,2,1,0,98,21};
        XuanZe xuanZe=new XuanZe();
        xuanZe.sortArray(arr);
        for (int i :arr ) {
            System.out.println(i);
        }
    }
    public void sortArray(int []arr){
        if(null==arr||arr.length<=0){
         return;
        }
        for (int i=0;i<arr.length;i++){
            int min=i;//将当前定义为最小的下角标
            for(int j=i+1;j<arr.length;j++){
                if(arr[min]>arr[j]){//如果比arr[min]小下角标交换
                    min=j;  //这个地方只交换下角标提高效率
                }
            }
            if(i!=min){//如果i!=min 说明存在比i还小的值
                int temp=arr[min];
                arr[min]=arr[i];
                arr[i]=temp;
            }
        }



    }
}
