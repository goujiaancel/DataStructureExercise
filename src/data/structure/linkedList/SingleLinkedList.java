package data.structure.linkedList;

/**
 * 单向链表的实现
 * 1.节点的实现
 * 2.创建链表,将节点加入链表
 *
 * 遍历的实现:
 * 1.通过一个辅助变量,帮助遍历整个单向链表
 */
public class SingleLinkedList {
    //一个头节点
    private SingleNode head;

    public SingleNode getHead() {
        return head;
    }

    public void setHead(SingleNode head) {
        this.head = head;
    }

    public SingleLinkedList() {
        SingleNode head = new SingleNode(0, "");
        this.head = head;
    }

    /**
     * 判断链表是否为空
     */
    public boolean isEmpty(){
        return head.getNext()==null;
    }


    /**
     * 向链表的尾端添加元素
     */
    public void add(SingleNode addNode) {
        if (null == head.getNext()) {
            head.setNext(addNode);
            return;
        }
        SingleNode temp = head.getNext();
        while (true) {
            if (temp.getNext() == null) {
                break;
            }
            temp = temp.getNext();
        }
        temp.setNext(addNode);
    }

    /**
     * 向指定的节点后插入元素,按照下标排序
     */
    public void insert(SingleNode node) {
        //空链表直接添加
        if (null == head.getNext()) {
            head.setNext(node);
            return;
        }
        SingleNode temp = head.getNext();
        boolean ok = false;
        while (true) {
            if (temp.getNo() == node.getNo()) {
                System.out.println("当前节点编号已经存在");
                break;
            }
            if (temp.getNext() == null) {
                if (temp.getNo() != node.getNo()) {
                    ok = true;
                }
                break;
            }
            if (temp.getNo() < node.getNo()
                    && temp.getNext().getNo() > node.getNo()
                    ) {
                ok = true;
                break;
            }
            temp = temp.getNext();
        }
        if(ok){
            node.setNext(temp.getNext());
            temp.setNext(node);
            System.out.println("插入完成!插入的节点信息为,编号:"+node.getNo()+",名称:"+node.getName());
        }
    }


    /**
     * 链表的遍历
     * 返回最尾端的元素
     */
    public void getAll() {
        //空链表
        if (null == head.getNext()) {
            return;
        }
        SingleNode temp = head.getNext();
        while (true) {
            if (null == temp) {
                break;
            }
            System.out.println(temp);
            temp = temp.getNext();
        }
    }

}
