package com.cys.kuaisu;

/**
 * Created by 跃 on 2017/4/14.
 * 快速排序的平均时间复杂度O(nlg(n)) 最坏O(n*n);
 */
public class KuaisuDigui {
    public static int getMiddle(int[] buf, int low, int high) {
        int temp = buf[low];
        while (low < high) {
            System.out.println(buf[low]);
            System.out.println(buf[high]);
            while (low < high && buf[high] >=temp) {//从后面往前比如果后面的比temp大或等于比较前移
                high--;
            }
            buf[low] = buf[high];//比temp小或等于的往前面放
            while (low < high && buf[low] <= temp) {//
                low++;
            }
            buf[high] = buf[low];//如果前面的比temp大往后放

        }
        buf[low] = temp;
        return low;//返回temp位置
    }
    public static void quickSort(int[]buf,int low,int high){
        if(low<high){
            int mid=getMiddle(buf,low,high);
            quickSort(buf,low,mid-1);//排左边的
            quickSort(buf,mid+1,high);//排右边的
        }
    }
    public static void diGuiKuaiSu(int []buf){
        quickSort(buf,0,buf.length-1);
    }
    public static void main(String[] args) {
        int []buf={1,4,3,1,4,3,0,8,3,9};
        diGuiKuaiSu(buf);
        System.out.println("-------------");
        for (int i :buf){
            System.out.println(i);
        }
    }
}
