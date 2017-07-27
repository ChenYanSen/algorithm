package com.cys.kuaisu;

import java.util.Stack;

/**
 * Created by 跃 on 2017/4/14.
 */
public class KuaiSuFieDiGui {
    public KuaiSuFieDiGui(int[] buf) {
        feiDiGui(buf, 0, buf.length - 1);
    }

    public int getMiddle(int[] buf, int low, int high) {
        int temp = buf[low];
        while (low < high) {
            while (low < high && buf[high] >= temp) high--;
            buf[low] = buf[high];
            while (low < high && buf[low] <= temp) low++;
            buf[high] = buf[low];
        }
        buf[low] = temp;
        return low;//返回temp的位置
    }

    public void feiDiGui(int[] buf, int low, int high) {
        Stack<Integer> stackLeft = new Stack<>(); //用于储存左边界
        Stack<Integer> stackRight = new Stack<>();//用于储存右边界
        stackLeft.push(low);
        stackRight.push(high);//装填
        while (!stackLeft.isEmpty()) {
            int left = stackLeft.pop();
            int right = stackRight.pop();
            int mid = getMiddle(buf, left, right);
            if (left < mid - 1) {
                stackLeft.push(left);
                stackRight.push(mid - 1);
            }
            if (right > mid + 1) {
                stackLeft.push(mid + 1);
                stackRight.push(right);
            }
        }
    }

    public static void main(String[] args) {
        int[] buf = {1, 13, 2, 4, 6, 9, 0, 3, 8};
        KuaiSuFieDiGui kuaiSuFieDiGui = new KuaiSuFieDiGui(buf);
        for (int i = 0; i < buf.length; i++) {
            System.out.println(buf[i]);
        }

    }
}
