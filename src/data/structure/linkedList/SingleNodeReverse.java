package data.structure.linkedList;

/**
 * 单链表的反转
 */
public class SingleNodeReverse {

    /**
     * 单链表的反转
     */
    public static void reverseSingleNode(SingleLinkedList singleLinkedList) {
        SingleNode head = singleLinkedList.getHead();
        //如果是空或者只有一个节点,不需要反转
        if (singleLinkedList.isEmpty() || singleLinkedList.getHead().getNext() == null) {
            return;
        }
        //当前节点
        SingleNode current = head.getNext();
        //当前节点的下一个节点
        SingleNode next = current.getNext();
        //临时变量,用于存储当前节点
        SingleNode temp = null;
        //i用于记录是第几次操作
        //1.第一次操作的时候当前节点就是最后一个节点,需要把next指向Null
        //2.如果不是第一次操作,就需要把next指向上一个节点,上一个节点已经用temp存储起来了
        int i = 1;
        while (current != null) {
            if (i == 1) {
                current.setNext(null);
            } else {
                current.setNext(temp);
            }
            //将当前节点保存,便于后续操作
            temp = current;
            //当前节点后移
            current = next;
            if (next != null) {
                //当前节点的下一个节点后移
                next = next.getNext();
            }
            //每操作一次自增
            i++;
        }
        //最后,将头节点指向最后一次遍历完成的current节点,完成单链表的反转,因为头节点在遍历过程中保持不动
        head.setNext(temp);
    }

}
