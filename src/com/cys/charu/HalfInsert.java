package com.cys.charu;

/**
 * Created by 跃 on 2017/4/25.
 */
public class HalfInsert {
    public static void main(String[] args) {
        int arr[]={1,5,3,5,2,9,0,33,23,6};
        halfInsertSort(arr);
        for(int i:arr)
            System.out.println(i);
    }
    public static  void halfInsertSort(int arr[]){
        int insertData;
        for(int i=1;i<arr.length;i++){
            insertData=arr[i];
            int low=0;
            int hight=i-1;
            while(low<hight){  // 注意 小于等于
                int mid=(low+hight)/2;
                if(insertData>arr[mid]){
                    low=mid+1;
                }else {
                    hight=mid-1;
                }
            }

            //依次后移
            for (int j=i;j>low;j--){
                arr[j]=arr[j-1];
            }
            arr[low]=insertData;
        }
    }
}
