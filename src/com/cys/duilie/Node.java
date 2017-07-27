package com.cys.duilie;

/**
 * Created by 跃 on 2017/7/15.
 */
public class Node<T> {
    public T data;
    public Node<T> next;


    public Node() {
    }

    public Node(T data) {
        this.data = data;
    }
    public Node(Node next,T t){
        this.data=data;
        this.next=next;
    }
}
