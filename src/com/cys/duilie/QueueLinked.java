package com.cys.duilie;

/**
 * Created by 跃 on 2017/7/15.
 */
public class QueueLinked<T> {
    private Node head;
    private Node tail;
    private int nodeCount=0;
    public QueueLinked() {
    }

    public void inQueue(T data) {
        //如果队列是空的head=tail
        if (null == head && null == tail) {
            tail = new Node(data);
            head = this.tail;
            nodeCount++;
        } else {
            tail.next = new Node(data);
            tail = tail.next;
            nodeCount++;
        }
    }

    public T outQueue() {
        if (null != head) {
            Node<T> out = head;
            head = head.next;
            out.next = null;
            nodeCount--;
            return out.data;
        }
        return null;
    }

    public boolean isEmpty() {
        if (head == null ) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        QueueLinked<Integer> queueLinked = new QueueLinked<>();
        /*queueLinked.inQueue(1);
        queueLinked.inQueue(2);
        queueLinked.inQueue(3);
        queueLinked.inQueue(4);
        queueLinked.inQueue(5);
        System.out.println(queueLinked.outQueue());
        System.out.println(queueLinked.outQueue());
        System.out.println(queueLinked.outQueue());*/
        //631758924
        queueLinked.inQueue(6);
        queueLinked.inQueue(3);
        queueLinked.inQueue(1);
        queueLinked.inQueue(7);
        queueLinked.inQueue(5);
        queueLinked.inQueue(8);
        queueLinked.inQueue(9);
        queueLinked.inQueue(2);
        queueLinked.inQueue(4);
        /*System.out.println(queueLinked.outQueue());
        System.out.println("--------------------");
        Integer integer = queueLinked.outQueue();
        queueLinked.inQueue(integer);
        System.out.println(queueLinked.outQueue());
        System.out.println(queueLinked.outQueue());
        System.out.println(queueLinked.outQueue());
        System.out.println(queueLinked.outQueue());
        System.out.println(queueLinked.outQueue());
        System.out.println(queueLinked.outQueue());
        System.out.println(queueLinked.outQueue());
        System.out.println(queueLinked.outQueue());
        System.out.println(queueLinked.outQueue());*/
        while (!queueLinked.isEmpty()) {
            System.out.println(queueLinked.outQueue());
            if(queueLinked.nodeCount>1){ //当剩最后一个的时候
                Integer integer = queueLinked.outQueue();
                queueLinked.inQueue(integer);
            }
        }

    }
}
