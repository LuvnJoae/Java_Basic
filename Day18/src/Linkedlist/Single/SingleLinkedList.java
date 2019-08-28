package Linkedlist.Single;
import java.awt.*;

//自己创建一个  链表管理类
public class SingleLinkedList {
    private int size;//链表的节点个数
    private Node head;//根节点
    private int currentIndex;//当前下标

    public SingleLinkedList() {
        size = 0;
        head = null;
        currentIndex = 0;
    }
    public int getSize() {
        return size;
    }

    //在尾部 添加 节点
    public void addEnd(Object data){
        if (head == null){
            head = new Node(data);
        }else {
            head.addNodeEnd(data);
        }
        size++;
    }
    //在头部添加  节点
    public void addStart(Object data){
        Node newNode = new Node(data);
        if (head == null){
            head = newNode;
        }else {
            newNode.next = head;
            head = newNode;
        }
        size++;
    }
    //删除包含 指定数据 的节点（数据不重复）
    public void del(Object data){
        if (head == null) return;
        if (head.getData() == data){
            head = head.next;
        }else {
            head.delNode(data);
        }
        size--;
    }
    //打印所有 （依次打印）
    public void print(){
        if (head != null){
            System.out.print(head.getData() + "->");
            head.printNode();
            System.out.println();
        }
    }
    //查找是否存在 指定 节点
    public boolean find(Object data){
        if (head == null) return false;
        if (head.getData() == data) {
            return true;
        } else {
            return head.findNode(data);
        }
    }
    //修改
    public boolean update(Object oldData,Object newData){
        if (head == null) return false;
        if (head.getData() == oldData){
            head.setData(newData);
            return true;
        }else {
            return head.updateNode(oldData,newData);
        }
    }
    //插入(前插，索引之前插入)
    public void insert(int index,Object data){
        if (index < 0 || index > size) {
            System.out.println("插入失败，下标越界或小于0");
            return;
        }
        currentIndex = 0;
        if (index == currentIndex){
            Node newNode = new Node(data);
            newNode.next = head;
            head = newNode;
        }else {
            head.insertNode(index,data);
        }
    }
    //插入（后插，索引之后插入）
    public void insertBack(int index, Object data){
        if (index < 0 || index > size) {
            System.out.println("插入失败，下标越界或小于0");
            return;
        }
        currentIndex = 0;
        if (index == currentIndex){
            Node newNode = new Node(data);
            newNode.next = head.next;
            head.next = newNode;
        }else {
            head.insertNodeBack(index,data);
        }
    }

    //  私有内部类，用于存储链表单个节点的  数据 和 指向
    private class Node{
        private Object data;
        private Node next; //把当前类型作为属性，表示 节点里 还有 节点，其实就是指向。

        //有参构造，用于直接给节点 数据
        public Node(Object data) {
            this.data = data;
        }
        //Getter和Setter
        public Object getData() {
            return data;
        }
        public void setData(Object data) {
            this.data = data;
        }
        public Node getNext() {
            return next;
        }
        public void setNext(Node next) {
            this.next = next;
        }

        //在尾部添加 节点
        public void addNodeEnd(Object data){
            if (this.next == null){
                this.next = new Node(data);
            }else{
                this.next.addNodeEnd(data);
            }
        }
        //删除节点
        public void delNode(Object data){
            if (this.next != null){
                if (this.next.data == data){
                    this.next = this.next.next;
                }else {
                    this.next.delNode(data);
                }
            }
        }
        //打印 节点
        public void printNode(){
            if (this.next != null){
                System.out.print(this.next.data + "->");
                this.next.printNode();
            }
        }
        //查找
        public boolean findNode(Object data){
            if (this.next != null){
                if (this.next.data == data){
                    return true;
                }else{
                    return this.next.findNode(data);
                }
            }
            return false;
        }
        //修改
        public boolean updateNode(Object oldData,Object newData){
            if (this.next != null){
                if (this.next.data == oldData){
                    this.next.data = newData;
                    return true;
                }else {
                    return this.next.updateNode(oldData,newData);
                }
            }
            return false;
        }
        //插入（前插）
        public void insertNode(int index, Object data){
            currentIndex++;
            if (index == currentIndex){
                Node newNode = new Node(data);
                newNode.next = this.next;
                this.next = newNode;
            }else {
                this.next.insertNode(index,data);
            }
        }
        //插入（后插）
        public void insertNodeBack(int index, Object data){
            currentIndex++;
            if (index == currentIndex){
                Node newNode = new Node(data);
                newNode.next = this.next.next;
                this.next.next = newNode;
            }else {
                this.next.insertNodeBack(index,data);
            }
        }
    }


}
