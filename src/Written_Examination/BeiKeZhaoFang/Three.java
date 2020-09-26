package Written_Examination.BeiKeZhaoFang;

import java.util.Scanner;

public class Three {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int len = sc.nextInt();
        int[] input = new int[len];

        for(int i = 0; i < len; i++){
            input[i] = sc.nextInt();
        }


//        int[][] dp = new int[len][len];
        int[] dd = new int[len];
        int max = 0;

        int mmin = Integer.MAX_VALUE;
        for(int i = 0; i < len; i++){

//            dp[i][i] = input[i];
            dd[i] = input[i];

            if(dd[i] > max){
                max = dd[i];
                mmin = 1;
            }

            for(int j = i+1; j < len; j++){


                dd[j] = input[j] | dd[j-1];

                if(dd[j] > max){
                    max = dd[j];
                    mmin = j-i+1;
                }
                if(dd[j] == max){
                    if(mmin > j-i+1){
                        mmin = j-i+1;
                    }
                }

            }
        }

        System.out.println(mmin);

//        int min = len;
//        for(int i = 0; i < len; i++){
//            for(int j = i; j < len; j++){
//                if(max == dp[i][j]){
//                    if(min > Math.abs(i-j)){
//                        min = Math.abs(i-j);
//                    }
//                }
//            }
//        }
//
//        System.out.println(min + 1);
//







    }


}
