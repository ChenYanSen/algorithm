package com.cys.arraydeques;

import java.util.ArrayDeque;
import java.util.Iterator;

public class DemoArrayDeque {
    public static void main(String[] args) {
        ArrayDeque<Integer> arrayDeque=new ArrayDeque<>();
        arrayDeque.add(1);
        arrayDeque.add(5);
        arrayDeque.add(3);
        arrayDeque.add(4);
       /* for (int i:arrayDeque){
            System.out.println(i);
        }*/
        for(Iterator<Integer> it=arrayDeque.iterator();it.hasNext();){
            System.out.println(it.next());
        }
    }
}
