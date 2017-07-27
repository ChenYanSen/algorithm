package com.cys.charu;

/**
 * Created by 跃 on 2017/4/25.
 */
public class Insert {
    public static void main(String[] args) {
     int arr[]={1,4,3,1,8,32,4,32,4,6};
     //元素后移
    // insertSort(arr);
        //交换元素
        insertSort(arr);
     for(int i:arr)
         System.out.println(i);
    }
    //直接插入从第二个和已默认排好序的比较从后往前插入  第一次 第一个默认排好序
    //数组数据整体后移
    public static void insertSort(int arr[]){
      for(int i=1;i<arr.length;i++){
          if(arr[i]<arr[i-1]){
              int temp=arr[i];
              int j=i;
              while(j>0&&arr[j-1]>temp){
                  arr[j]=arr[j-1];
                  j--;
              }
              arr[j]=temp;
          }
      }

    }
   public static void insertSort_01(int []arr){
        for (int i=1;i<arr.length;i++){
            if(arr[i]<arr[i-1]){
                int temp=arr[i];
                int j=i;
                while (j>0&&arr[j-1]>temp){
                    arr[j]=arr[j-1];
                    j--;
                }
                arr[j]=temp;
            }
        }
   }
    //再对将a[j]插入到前面a[0…j-1]的有序区间所用的方法进行改写，
    // 用数据交换代替数据后移。如果a[j]前一个数据a[j-1] > a[j]，就交换a[j]和a[j-1]，
    // 再j--直到a[j-1] <= a[j]。这样也可以实现将一个新数据并入到有序区间。
    public static void insertSort_2(int arr[]){
        for(int i=1;i<arr.length;i++)
            for(int j=i-1;j>0&&arr[j]>arr[j+1];j--){
            int temp=arr[j];
            arr[j]=arr[j+1];
            arr[j+1]=temp;
            }
    }


    public static void insertSort_02(int []arr){
        for (int i=0;i<arr.length;i++){
            for (int j=i-1;j>0&&arr[j]>arr[j+1];j--){
                int tem=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=tem;
            }
        }
    }



}
