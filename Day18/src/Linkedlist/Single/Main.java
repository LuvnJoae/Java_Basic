package Linkedlist.Single;

public class Main {
    public static void main(String[] args) {
        SingleLinkedList nodeList = new SingleLinkedList();
        nodeList.addEnd(5);
        nodeList.addEnd(6);
        nodeList.addEnd(7);
        nodeList.addEnd(8);
        nodeList.addEnd(9);
        nodeList.print();

        nodeList.addStart(1);
        nodeList.addStart(2);
        nodeList.addStart(3);
        nodeList.addStart(4);
        nodeList.addStart(0);
        nodeList.print();

        nodeList.update(1,11);
        nodeList.print();

        System.out.println(nodeList.find(5));
        System.out.println(nodeList.find(88));

        nodeList.del(5);
        nodeList.print();

        System.out.println(nodeList.getSize());

        nodeList.insert(1,10);
        nodeList.print();

        nodeList.insertBack(9,20);
        nodeList.print();


    }
}
