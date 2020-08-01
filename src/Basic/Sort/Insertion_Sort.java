package Basic.Sort;

import java.util.Arrays;
public class Insertion_Sort implements Sort {

    @Override
    public int[] sort(int[] array) {

        int[] arr = Arrays.copyOf(array,array.length);

        for(int i =1; i<arr.length;++i){

            // 记录要插入的数据
            int tmp = arr[i];

            // 从已经排序的序列最右边开始，找比其小的数
            // 只要比tmp小，就将数组向右移一位
            // 最后将合适位置的数字变为tmp
            int j = i;
            while(j>0 && tmp<arr[j-1]){
                arr[j] = arr[j-1];
                j--;
            }
            if(j != i){
                arr[j] = tmp;
            }


        }

        return arr;
    }
}
