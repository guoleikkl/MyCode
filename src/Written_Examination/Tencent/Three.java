package Written_Examination.Tencent;

import java.util.Scanner;

public class Three {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        long[] nums = new long[T];
        for(int i = 0; i < T; i++){
            nums[i] = sc.nextLong();
        }


//        int max = 0;
//        long mm = 0,nn = 0;
        for(int i = 0; i < T; i++){
            int max = 0;
            int tmp = 0;
            for(long j = 0L; j < nums[i]; j++){
                tmp = getVal(j, nums[i] - j);
                System.out.println(tmp);
                if(max < tmp){
                    max = tmp;
//                    mm = j;
//                    nn = nums[i] - j;
                    
//                    System.out.println("  ----" + max);
//                    System.out.print("");
                }

            }
            System.out.println(max);
        }
//        System.out.println(max + " " + mm + " " + nn);


    }

    // 获取val值
    private static int getVal(long a, long b){
        int suma = 0;
        while(a != 0){
            suma += a%10;
            a = a/10;
        }
        int sumb = 0;
        while(b != 0){
            sumb += b%10;
            b = b/10;
        }

        return suma + sumb;
    }

}
