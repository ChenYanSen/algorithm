package MyLinkedList;

/**
 * Created by 跃 on 2017/7/13.
 */
public class MyLinkedList <T>{
    private Node<T> current=new Node<T>();//定义头节点
    private Node<T> head=current;//记录头节点
    private int pos=0;//定义节点位置
    public MyLinkedList(){}//定义一个空链表
    //添加节点
    public void addNode(T data){
        Node<T> node=new Node<T>(data);
        current.next=node;
        current=node;
        pos++;
    }
    //删除节点并返回头指针
    public Node<T> removeLast(){
        Node<T> pHead=head;
        Node<T> secondLast;
        while (head!=null){
                secondLast=head;
              if(secondLast.next==current){
                  secondLast.next=null;
                  break;
              }
              head=head.next;
        }
        return head;
    }
    public Node<T> reverseList(){

        if(head.next==null) {
            return head;
        }
        Node<T> pHead=head;//当前头指针
        Node<T> next=head.next;//链表下一节点
        Node<T> temp=null;//临时接地点
        while (next!=null){
            temp=next.next;//保存下下一节点防止丢失
            next.next=pHead;//下一节点连接上一节点
            pHead=next;//指针移动
            next=temp;
            System.out.println(pHead.data);
        }
        //原来的头结点设为空
        head.next=null;
      return pHead;

    }
    //遍历
    public void forEachList(){
        Node<T> pHead=head;
        forEach(pHead);
    }
    //遍历链表
    public void forEach(Node<T> p){
        Node<T> pHead=p;
        while (null!=pHead.next){
            if(null!=pHead.next.data)
                System.out.println(pHead.next.data);
            pHead=pHead.next;
        }

    }
    //在数据T之后插入
    public void insertAt(T t1,T t2 ){
        Node<T> pHead=head;
        Node<T> current;//保存当前指针
        Node<T> currentNext;//保存当前后面的指针
        while (pHead!=null){
            current=pHead;
            currentNext=pHead.next;
            if(current.data==t1){
                Node<T>  insert=new Node<T>(t2);
                insert.next=currentNext;
                current.next=insert;
            }
            pHead=pHead.next;
        }
    }
    //定点去除
    public void removeAt(T t){
        Node<T> pHead=head;
        Node<T> temp;//保存下个节点
        while (null!=pHead.next){
           if (pHead.next.data==t){
               temp=pHead.next.next;
               pHead.next=temp;
           }
           pHead=pHead.next;
        }
    }
    public static void main(String[] args) {
            MyLinkedList<Integer> myLinkedList=new MyLinkedList<Integer>();
            myLinkedList.addNode(1);
            myLinkedList.addNode(2);
            myLinkedList.addNode(3);
            myLinkedList.addNode(4);
     //   Node<Integer> reverseList = myLinkedList.reverseList();
       // myLinkedList.forEachList();
      //  myLinkedList.forEach(reverseList);
        myLinkedList.insertAt(3,10);
        myLinkedList.forEachList();
        myLinkedList.removeAt(3);
        myLinkedList.forEachList();
    }
}
