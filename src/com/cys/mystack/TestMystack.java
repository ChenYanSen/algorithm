package com.cys.mystack;



/**
 * Created by 跃 on 2017/7/12.
 */
public class TestMystack {
    public static void main(String[] args) {
        Mystack<Integer> mystack=new Mystack<>(4);
        mystack.push(1);
        mystack.push(2);
        mystack.push(3);
        mystack.push(4);

        Integer pop = mystack.pop();
        System.out.println(pop);
        Integer pop1 = mystack.pop();
        System.out.println(pop1);
    }

    public Node ReverseList(Node head) {

       /* ListNode node=head;
        ListNode listNode=head;
        Stack<Integer> stack=new Stack<>();
        if(head==null)
            return null;
        while (null!=node){
            stack.push(node.val);
            node=node.next;
        }
        while(!stack.isEmpty()){
            int val=stack.pop();
            listNode.val=val;
            listNode=listNode.next;
        }
        return head;*/
        //按栈的顺序排
        Node reHead=head;
        Node next=head;
        Node  hh=head;
        Node temp;
        Node top=null;
        Node topNext=null;
        while(hh!=null){
            temp=hh;
            next=hh.next;

            topNext=top;
            top=hh;
            top.next=topNext;
            hh=hh.next;
        }

        return  top;}
}
