package com.cys.allresearch;

/**
 * Created by 跃 on 2017/7/16.
 */
public class Search {
    private int[] a = {0,1,2,3,4,5,6,7,8,9};
    private int[] book = new int[10];
    int n=a.length;

    public int sum(int i, int sums) {
        if (i == 1)
            return 1 + sums;
        else {
            return sum(i - 1, i + sums);
        }


    }

    public int sum2(int n) {
        int sum = 1;
        for (int i = n; i > 1; i = i - 2) {
            sum = i * (i - 1) * sum;
        }
        return sum;
    }

    public static void main(String[] args) {
        Search search = new Search();
        int sum = search.sum(10, 0);
        System.out.println(sum);
        int i = search.sum2(4);
        System.out.println(i);
        System.out.println("----------------");
        search.dfs(1);

    }

    public void dfs(int step) {

         if(step==n){
             for(int i=0;i<n;i++)
                 System.out.print(a[i]+" ");
             System.out.println("-------------------");
         }
         for (int j=0;j<n-1;j++){
             if(book[j]==0){
                 a[step]=j;//表示将i放到第step个盒子中
                 book[j]=1;
                 dfs(step+1);
                 book[j]=0;
             }
         }

    }

    public void searchMethod() {

    }
}
