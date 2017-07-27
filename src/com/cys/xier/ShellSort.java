package com.cys.xier;

/**
 * 先取一个小于n的整数d1作为第一个增量，把文件的全部记录分组。所有距离为d1的倍数的记录放在同一个组中。
 * 先在各组内进行直接插入排序；然后，取第二个增量d2<d1重复上述的分组和排序，直至所取的增量  =1(  <  …<d2<d1)，
 * 即所有记录放在同一组中进行直接插入排序为止
 */
public class ShellSort {
    public static void main(String[] args) {
        int arr[] = {49, 38, 65, 97, 26, 13, 27, 49, 55, 4};
        shellSort_3(arr);
        for (int i : arr)
            System.out.println(i);
    }

    public static void shellSort_1(int[] a) {//数组
        for (int gap = a.length / 2; gap > 0; gap /= 2) {
            for (int i = 0; i < gap; i++) {
                for (int j = i + gap; j < a.length; j += gap) {
                    int temp = a[j];
                    int k = j - gap;
                    while (k >= 0 && a[k] > temp) {
                        a[k + gap] = a[k];
                        k -= gap;
                    }
                    a[k + gap] = temp;
                }
            }
        }
    }
    /**
     * 很明显，上面的shellsort1代码虽然对直观的理解希尔排序有帮助，但代码量太大了，不够简洁清晰。
     * 因此进行下改进和优化，以第二次排序为例，原来是每次从1A到1E，从2A到2E，可以改成从1B开始，
     * 先和1A比较，然后取2B与2A比较，再取1C与前面自己组内的数据比较…….。这种每次从数组第gap个
     * 元素开始，每个元素与自己组内的数据进行直接插入排序显然也是正确的
     */
    public void shellSort_2(int []arr){
        for(int gap=arr.length/2;gap>0;gap/=2){
            for(int j=gap;j<arr.length;j++){//从每组的第grp个元素开始
                if(arr[j]<arr[j-gap]){//每个元素与组内的元素之间进行插入排序
                    int temp=arr[j];
                    int k=j-gap;
                    while (k>=0&&arr[k]>temp){
                        arr[k+gap]=arr[k];
                        k-=gap;
                    }
                    arr[k+gap]=temp;

                }
            }
        }
    }
    /**
     * 再将直接插入排序部分用 白话经典算法系列之二
     * 直接插入排序的三种实现  中直接插入排序的第三种方法来改写下
     */
    public static void shellSort_3(int []arr){
        for(int gap=arr.length/2;gap>0;gap/=2){
            for(int i=gap;i<arr.length;i++){
                for(int j=i-gap;j>=0&&arr[j]>arr[j+gap];j-=gap){
                    int temp=arr[j];
                    arr[j]=arr[j+gap];
                    arr[j+gap]=temp;
                }
            }
        }
    }
}
