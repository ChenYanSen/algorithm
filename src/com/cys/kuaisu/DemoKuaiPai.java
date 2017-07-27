package com.cys.kuaisu;

/**
 * Created by 跃 on 2017/7/11.
 */
 class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }

}
public class DemoKuaiPai {
    public ListNode FindKthToTail(ListNode head,int k) {
      /*  ListNode node=head;
        ListNode listNode=head;

        int tem=0,val=0;
        while(node!=null){
            node=node.next;
            tem++;

        }
        if(tem<k)
            return null;
        for(int i=0;i<tem-k;i++){
            listNode=listNode.next;
        }
        return listNode;*/

        //------------
        ListNode  node=head;
        ListNode nodeHead=head;
        if(head==null)
            return null;
        int num=0;
        while(nodeHead!=null){
            ListNode next;
            next=nodeHead.next;
            nodeHead=next;
            num++;
        }
        if(k>num)
            return null;
        for(int i=0;i<num-k;i++){
            node=node.next;

        }
        return node;
    }
    public ListNode ReverseList(ListNode head) {

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
       ListNode reHead=head;
       ListNode next=head;
       ListNode  hh=head;
       ListNode temp;
       ListNode top=null;
        ListNode topNext=null;
       while(hh!=null){
           temp=hh;
           next=hh.next;

           topNext=top;
           top=hh;
           top.next=topNext;
          hh=hh.next;
       }

   return  top;
    }


        public static void main(String[] args) {

        }
}
