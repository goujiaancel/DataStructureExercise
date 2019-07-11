package data.structure.queue;


/**
 * 环形数组实现队列
 */
public class ArrayQueue {
    private int maxSize;//队列的最大长度,实际可存储的容量为maxSize-1
    private int front;//指向头部节点
    private int back;//指向尾部节点
    private int[] array;

    /**
     * 队列的构造方法
     *
     */
    public ArrayQueue(int maxSize) {
        this.maxSize = maxSize+1;
        array = new int[this.maxSize];
        front = 0;
        back = 0;
    }

    /**
     * 判断队列是否为空,如果头部节点和尾部节点相等,则为空
     * @return
     */
    public boolean isEmpty(){
        return front==back;
    }

    /**
     * 判断队列是否满了
     * 队列可以存储的元素为最大容量-1
     */
    public boolean isFull(){
        return (back+1)%maxSize==front;
    }

    /**
     * 向队列添加元素,并返回被添加的元素
     */
    public int add(int value){
        if(isFull()){
            System.out.print("队列已经满了~~");
            throw new RuntimeException("队列已经满了~~");
        }
        array[++back%maxSize] = value;
        System.out.println("添加元素成功!");
        return value;
    }

    /**
     * 取出一个元素
     */
    public int get(){
        if(isEmpty()){
            System.out.print("当前队列为空~~");
            throw new RuntimeException("当前队列为空~~");
        }
        front = ++front%maxSize;
        return array[front];
    }


    public static void main(String[] args) {
        ArrayQueue queue = new ArrayQueue(6);
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        queue.add(6);
        System.out.println("当前弹出的元素为:"+queue.get());
        System.out.println("当前弹出的元素为:"+queue.get());
        System.out.println("当前弹出的元素为:"+queue.get());
        System.out.println("当前弹出的元素为:"+queue.get());
        System.out.println("当前弹出的元素为:"+queue.get());
        System.out.println("当前弹出的元素为:"+queue.get());
        queue.add(13);
        queue.add(11);
        System.out.println("当前弹出的元素为:"+queue.get());
        System.out.println("当前弹出的元素为:"+queue.get());
        queue.add(14);
        queue.add(15);
        queue.add(16);
        queue.add(17);
        queue.add(18);
        queue.add(19);
        System.out.println("当前弹出的元素为:"+queue.get());
        System.out.println("当前弹出的元素为:"+queue.get());
        System.out.println("当前弹出的元素为:"+queue.get());
        System.out.println("当前弹出的元素为:"+queue.get());
        System.out.println("当前弹出的元素为:"+queue.get());
        System.out.println("当前弹出的元素为:"+queue.get());



    }







}
