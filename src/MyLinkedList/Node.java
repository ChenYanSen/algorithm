package MyLinkedList;

/**
 * Created by 跃 on 2017/7/13.
 */
public class Node<T> {
    public T data;
    public Node next;
    public Node(){}
    public Node(T data){
        this.data=data;
    }
    public T getCurrentData(){
        return data;
    }
}
