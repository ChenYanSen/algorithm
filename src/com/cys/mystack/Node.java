package com.cys.mystack;

/**
 * Created by 跃 on 2017/7/12.
 * 构造栈结构
 */
public class Node<T> {
    public T data;
    public Node next;
    public Node(){}
    public Node(T data ,Node next){
        this.data=data;
        this.next=next;
    }
}
