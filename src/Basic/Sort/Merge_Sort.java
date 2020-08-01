package Basic.Sort;

import java.util.Arrays;

// 合并排序
public class Merge_Sort implements Sort {
    @Override
    public int[] sort(int[] array){
        int[] arr = Arrays.copyOf(array,array.length);
        sort(arr,0,arr.length-1);
        return arr;
    }

    public static void sort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = (left+right) >> 1;
            sort(arr,left,mid);    // 左边归并排序，使得左子序列有序
            sort(arr,mid+1,right);   // 右边归并排序，使得右子序列有序
            merge(arr,left,mid,right); // 将两个有序子数组合并
        }
    }

    private static void merge(int[] arr, int left, int mid, int right){
        int[] temp = new int[arr.length];
        int i = left;   // 左序列指针
        int j = mid+1;  // 右序列指针
        int t = i;  // 临时数组指针

        while(i <= mid && j <= right){
            if(arr[i] <= arr[j]){
                temp[t++] = arr[i++];
            } else {
                temp[t++] = arr[j++];
            }
        }

        // 将左边剩余元素填入temp
        while(i <= mid){
            temp[t++] = arr[i++];
        }
        // 将右边剩余元素填入temp
        while(j <= right){
            temp[t++] = arr[j++];
        }
        t=left;
        // 将temp中的元素拷贝到原数组
        while(left <= right){
            arr[left++] = temp[t++];
        }
    }
}
