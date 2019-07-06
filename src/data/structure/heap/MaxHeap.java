package data.structure.heap;

public class MaxHeap {

    private int[] generateData(int size,int maximum){
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * maximum);
        }
        return arr;
    }

    public static void main(String[] args) {
        MaxHeap maxHeap = new MaxHeap();
        //随机生成100个随机数,最大值为1000
        int[] arr = maxHeap.generateData(100, 1000);
        //构造大顶堆
        maxHeap.buildMaxHeap(arr, arr.length);
        //排序
        maxHeap.sort(arr);
        //将数组的下标从大到小打印出来
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i]);
            if (i > 0) {
                System.out.print(",");
            }
        }
    }

    /**
     *
     * @param arr int数组
     * @param size 数组的有效大小
     */
    public void buildMaxHeap(int[] arr,int size) {
        //从最后一个结点的父结点开始,反复调整堆
        //最后一个子结点的索引arr.length - 1
        //最后一个子结点对应的父结点的索引arr.length - 1 - 1
        //构造大顶堆
        for (int i = (size - 1 - 1) / 2; i >= 0; i--) {
            buildHeap(arr, i,size);
        }
    }

    private void buildHeap(int[] arr , int parentIndex,int currentSize) {
        //从左二子和右儿子中选出一个较大的和当前结点进行比较
        int leftChildIndex = 2 * parentIndex + 1;
        int rightChildIndex = 2 * parentIndex + 2;
        int largerChildIndex;
        //如果没有右边的儿子
        if (rightChildIndex > currentSize - 1) {
            largerChildIndex = leftChildIndex;
        } else {
            largerChildIndex = arr[leftChildIndex] > arr[rightChildIndex] ? leftChildIndex : rightChildIndex;
        }
        exchange(arr, parentIndex, largerChildIndex,currentSize);
    }

    private void exchange(int[] arr,int parentIndex,int compareToIndex,int currentSize) {
        if (arr[parentIndex] > arr[compareToIndex]) {
            return;
        }
        int temp = arr[parentIndex];
        arr[parentIndex] = arr[compareToIndex];
        arr[compareToIndex] = temp;
        //判断被比较的结点是否是叶子结点,即判断是否有左儿子,如果有左二子,还需要继续和子结点比较
        if (2 * compareToIndex + 1 <= currentSize - 1) {
            buildHeap(arr, compareToIndex,currentSize);
        }
    }

    /**
     * 给定int数组,返回最大的元素
     * @param arr int数组
     * @param smaller 从最大下标开始,减小的长度
     * @return
     */
    private int removeMax(int[] arr,int smaller) {
        int temp;
        int max = arr[0];
        temp = arr[arr.length - 1 - smaller];
        arr[arr.length - 1 - smaller] = arr[0];
        arr[0] = temp;
        //数组的容量减小1个
        //最后一个子结点对应的父结点的索引
        if (arr.length - smaller - 1 > 1) {
            buildMaxHeap(arr, arr.length - smaller - 1);
        }
        return max;
    }

    /**
     * 给定int[]数组,实现下标的元素从小到大的排序
     * @param arr
     */
    private void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            removeMax(arr, i);
        }
    }

}
