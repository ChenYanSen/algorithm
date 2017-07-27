package com.cys.mystack;

/**
 * Created by 跃 on 2017/7/12.
 */
public class Mystack <T>{
    //节点
private Node top;
//站内元素个数
private int elementCount;
//指定栈大小
    private int size;
public Mystack(){
}
public Mystack(int size){
    this.size=size;
}
public boolean isFull(){
    if(size==elementCount){
        return  true;
    }
    return false;
}
//入栈
    public void push(T element){
    if(this.isFull())
        throw new RuntimeException("stack is full");
        top=new Node(element,top);
        elementCount++;
}
    //判断是否为空
    public boolean isEmpty(){
        if(elementCount==0)
        { return true;}
        return false;
    }
    public T pop(){
      if(this.isEmpty()){
          throw new RuntimeException("stack is empty");
      }
      Node<T> oldTop=top;
      top=top.next;
      oldTop.next=null;
      return oldTop.data;
    }
    public T peak(){
        if(this.isEmpty())
            throw new RuntimeException("stack is empty");
        return (T) top.data;
    }
    public int getElementCount(){
        return elementCount;
    }
}
