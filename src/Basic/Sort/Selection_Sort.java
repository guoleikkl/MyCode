package Basic.Sort;

import java.util.Arrays;

// 选择排序
public class Selection_Sort implements Sort {
    @Override
    public int[] sort(int[] array) {

        int[] arr = Arrays.copyOf(array, array.length);

        for(int i =0;i<arr.length;++i){
            int min = i;

            // 找出未排序数组中的最小值
            for(int j = i+1; j<arr.length;++j){
                if(arr[min] > arr[j]){
                    min = j;
                }
            }

            // 将找到的最小值放到最前面
            if(i != min){
                int tmp = arr[i];
                arr[i] = arr[min];
                arr[min] = tmp;
            }
        }

        return arr;

    }
}
