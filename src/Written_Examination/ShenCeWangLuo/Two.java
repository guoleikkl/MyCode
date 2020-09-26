package Written_Examination.ShenCeWangLuo;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Two {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

//        int[] arr = new int[input];

        long[] arr = new long[input];

        for(int i = 0; i < input; i++){
            arr[i] = sc.nextLong();
        }

        HashMap<Long, Integer> map = new HashMap<>();
        for(int i = 0; i < input; i++){
            if(map.get(arr[i]) == null){
                map.put(arr[i],1);
            } else {
                map.put(arr[i],map.get(arr[i])+1);
            }
        }
        int max = 0;
        long maxnum = 0;
        for(Map.Entry<Long,Integer> entry : map.entrySet()){
            if(max == entry.getValue()){
                if(maxnum > entry.getKey()){
                    maxnum = entry.getKey();
                }
            }
            else if(max < entry.getValue()){
                max = entry.getValue();
                maxnum = entry.getKey();
            }

        }

        System.out.println(maxnum);
        System.out.println(max);




    }

}
