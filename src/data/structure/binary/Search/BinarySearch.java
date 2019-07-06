package data.structure.binary.Search;

public class BinarySearch {


    /**
     * 二分查找,返回被查找元素所在的下标
     *
     * @return
     */
    private int findByBinarySearch(int[] datas, int toBeFind) {

        int left = 0;
        int right = datas.length - 1;
        int middle = 0;
        while (left <= right) {
            middle = (left + right) / 2;
            if (datas[middle] == toBeFind) {
                System.out.print("找到了,下标是 : "+middle);
                return middle;
            } else if (datas[middle] < toBeFind) {
                left = middle;
            } else {
                right = middle;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        BinarySearch binarySearch  =new BinarySearch();
        binarySearch.findByBinarySearch(new int[]{1,2,4,5,6,7,8,9,11,13,14,16,77,889,123455},14);

    }


}
