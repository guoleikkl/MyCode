package Written_Examination.BeiKeZhaoFang;


import java.util.Scanner;

/*
 * 分为偶数和奇数情况
 * 将字符串分为两部分，比较两部分不相同的字符的个数
 */
public class One {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int len = Integer.parseInt(sc.nextLine());

        String input = sc.nextLine();
//
//        System.out.println(len);
//        System.out.println(input);

        int result = 0;

        if(len < 2){
            System.out.println(0);
        }

        // 将字符串转化为字符数组
        char[] ch = input.toCharArray();
        int mid = len/2;
//        if(len%2 == 0){
            int right = len-1;

            for(int i = 0; i < mid; i++){

                if(ch[i] != ch[right]){
                    result++;
                }
                right--;
            }
//        }

        System.out.println(result);




    }

}
