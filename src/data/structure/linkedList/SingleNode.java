package data.structure.linkedList;

public class SingleNode {

    private int no;
    private String name;
    private SingleNode next;

    /**
     * 构造函数
     * @param no
     * @param name
     */
    public SingleNode(int no, String name) {
        this.no = no;
        this.name = name;
        this.next = null;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SingleNode getNext() {
        return next;
    }

    public void setNext(SingleNode next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "当前节点的编号为:" + no + ",当前节点的名称为:" + name;
    }
}
