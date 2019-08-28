package Linkedlist.Single;


public class SingleLinkedList2 {
    private int size;
    private int currentIndex;
    private Node head;

    public SingleLinkedList2() {
        size = 0;
        currentIndex = 0;
        head = null;
    }
//  添加 尾插
    public void add(Object data){
        if (head == null){
            head = new Node(data);
        }else {
            head.next.addNode(data);
        }
    }
//  添加 头插
    public void add2(Object data){
        Node newHead = new Node(data);
        if (head == null){
            head = newHead;
        }else {
            newHead.next = head;
            head = newHead;
        }
    }
//  删除
    public void delete(Object data){
        if (head == null) return;
        if (head.getData() == data){
            head = head.next;
        }else {
            head.deleteNode(data);
        }
    }
//  显示
    public void print(){
        if (head != null){
            System.out.print(head.getData() + " ->");
            head.printNode();
            System.out.println();
        }
    }
//  插入 前插
    public void insert(int index,Object data){
        if ( index < 0 || index > size){
            System.out.println("下标错误");
            return;
        }
        currentIndex = 0;
        if (index == currentIndex){
            Node newNode = new Node(data);
            newNode.next = head;
            head = newNode;
        }else {
            head.insertNode(index, data);
        }
    }
//  插入 后插
    public void insert2(int index, Object data){
        if ( index < 0 || index > size){
            System.out.println("下标错误");
            return;
        }
        currentIndex = 0;
        if (index == currentIndex){
            Node newNode = new Node(data);
            newNode.next = head.next;
            head.next = newNode;
        }else {
            head.insertNode2(index, data);
        }
    }

    private class Node{
        private Node next;
        private Object data;

        public Node(Object data) {
            this.data = data;
        }

        public Node getNext() {
            return next;
        }
        public void setNext(Node next) {
            this.next = next;
        }
        public Object getData() {
            return data;
        }
        public void setData(Object data) {
            this.data = data;
        }

    //  添加 尾插
        public void addNode(Object data){
            if (this.next == null){
                this.next = new Node(data);
            }else {
                this.next.addNode(data);
            }
        }
    //  删除
        public void deleteNode(Object data){
            if (this.next == null) return;
            if (this.next != null){
                if (this.next.data == data){
                    this.next = this.next.next;
                }else {
                    this.next.deleteNode(data);
                }
            }
        }
    //  显示
        public void printNode(){
            if (this.next != null){
                System.out.println(this.next.data + "->");
                this.printNode();
            }
        }
    //  插入 前插
        public void insertNode(int index, Object data){
            currentIndex++;
            if ( index == currentIndex){
                Node newNode = new Node(data);
                newNode.next = this.next;
                this.next = newNode;
            }else {
                this.next.insertNode(index,data);
            }
        }
    //  插入 后插
        public void insertNode2(int index, Object data){
            currentIndex++;
            if ( index == currentIndex){
                Node newNode = new Node(data);
                newNode.next = this.next.next;
                this.next.next = newNode;
            }else {
                this.next.insertNode(index,data);
            }
        }
    }

}
