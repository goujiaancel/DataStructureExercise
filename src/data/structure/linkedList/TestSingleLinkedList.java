package data.structure.linkedList;

import java.util.Stack;

public class TestSingleLinkedList {

    public static void main(String[] args) {
        //初始化单向链表
        SingleLinkedList singleLinkedList = new SingleLinkedList();
        //向链表中添加元素
        SingleNode a1 = new SingleNode(1,"Mary");
        SingleNode a2= new SingleNode(2,"Mike");
        SingleNode a3 = new SingleNode(3,"Tom");
        SingleNode a4 = new SingleNode(4,"Peter");
        SingleNode a5 = new SingleNode(5,"Tim");
        SingleNode a6 = new SingleNode(6,"Andy");
        SingleNode a7 = new SingleNode(7,"John");
        SingleNode a8 = new SingleNode(8,"JBoss");
        SingleNode a9 = new SingleNode(9,"Jssk");
        singleLinkedList.add(a1);
        singleLinkedList.add(a2);
        singleLinkedList.add(a3);
        singleLinkedList.add(a4);
        singleLinkedList.add(a5);
        singleLinkedList.add(a6);
        singleLinkedList.add(a7);
        singleLinkedList.add(a8);
        singleLinkedList.add(a9);
        singleLinkedList.getAll();
        SingleNodeReverse.reverseSingleNode(singleLinkedList);
        singleLinkedList.getAll();


    }
}
