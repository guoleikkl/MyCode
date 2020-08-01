package Basic.Sort;


//import com.sun.org.apache.xalan.internal.xsltc.util.IntegerArray;

import java.lang.reflect.Array;

// 冒泡排序
public class Bubble_Sort implements Sort {

    @Override
    public int[] sort(int[] array) {

        int[] arr = array.clone();

        for(int i = 0; i < arr.length; ++i){
            // 设置一个标记，如果未true，则表示这次循环没有进行交换，排序已经完成
            boolean b = true;

            for(int j = i; j < arr.length-1; j++){
                if(arr[j] > arr[j+1]){
                    int t = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = t;

                    b = false;
                }
            }
            if(b){
                break;
            }
        }
        return arr;
    }
}
