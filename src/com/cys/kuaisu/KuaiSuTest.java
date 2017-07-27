package com.cys.kuaisu;

/**
 * Created by 跃 on 2017/7/15.
 */
public class KuaiSuTest {
    public int sortOne(int begin, int end, int[] arr) {
        int left=begin;
        int right=end;
        int change=0;
        int temp = arr[begin];
        while (left < right) {
            while (arr[right] >= temp && right > left) {//士兵end总是先从后往前找因为begin是基准
                right--;
            }
            //tempEnd=arr[end];
            while (arr[left] <= temp && right > left) {
                left++;
            }
            if (left < right) {//当两个士兵没有相遇时交换
             change=arr[left];
             arr[left]=arr[right];
             arr[right]=change;
            }
        }
        //最后的基数归位
        arr[begin]=arr[left];
        arr[left]=temp;
        return left;

    }

    public void useKuaiPai(int begin,int end,int []arr) {
        if(begin<end){
        int temp = sortOne(begin, end, arr);
         useKuaiPai(begin,temp-1,arr);
         useKuaiPai(temp+1,end,arr);}
    }
    public void showKuaiPai(int []arr){
        useKuaiPai(0,arr.length-1,arr);
    }

    public static void main(String[] args) {
        KuaiSuTest kuaiSuTest = new KuaiSuTest();
        int[] arr = {5, 3, 1, 4, 2, 8, 9, 0};
       // kuaiSuTest.useKuaiPai(arr);
        kuaiSuTest.showKuaiPai(arr);
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
