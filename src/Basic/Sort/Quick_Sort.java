package Basic.Sort;

public class Quick_Sort implements Sort {
    @Override
    public int[] sort(int[] array) {

        int[] arr = array.clone();

        return quickSort(arr,0,arr.length-1);
    }

    public static int[] quickSort(int[] arr, int left, int right){
        if(left < right){
            int partitionIndex = partition(arr, left, right);
            quickSort(arr, left, partitionIndex-1);
            quickSort(arr, partitionIndex+1, right);
        }
        return arr;
    }

    public static int partition(int[] arr, int left, int right){
        // 设置基准值
        int pivot = left;
        int index = pivot+1;
        for(int i = index; i <= right; i++){
            if(arr[i] < arr[pivot]){
                swap(arr,i,index);
                index++;
            }
        }
        swap(arr,pivot,index-1);
        return index-1;
    }


    public static void swap(int[] arr, int i, int j){
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }

}
