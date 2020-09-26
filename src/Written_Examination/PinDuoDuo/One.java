package Written_Examination.PinDuoDuo;

import java.util.Scanner;

public class One {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String input1 = sc.nextLine();
        String input2 = sc.nextLine();

        // 将第一行输入转换成数组
        String[] strArr1 = input1.split(" ");
        int[] num1 = new int[strArr1.length];
        for(int i = 0; i < strArr1.length; i++) {
            num1[i] = Integer.parseInt(strArr1[i]);
        }
        // 将第二行输入转换成数组
        String[] strArr2 = input2.split(" ");
        int[] num2 = new int[strArr2.length];
        for(int i = 0; i < strArr2.length; i++) {
            num2[i] = Integer.parseInt(strArr2[i]);
        }

        if(num1[0] == 0){
            System.out.println("paradox");
        }

        // 刚好走到终点的情况
        int sum = 0;
        int back = 0;
        int flag = 0;// 0为初始状态，1为刚好能走到终点，2为需要回退
        for(int i = 0; i < num1[1]; i++) {
            sum += num2[i];
            if(sum == num1[0]) {
                flag = 1;
                break;
            }
            else if(sum > num1[0]){
                flag = 2;
                back++;
                sum = sum - num2[i];
            }
        }
        if(flag == 1){
            System.out.println("paradox");
        }

        // 没走到终点的情况
        if(flag == 0){
            int nn = num1[0] - sum;
            System.out.print(nn+" "+0);
        }

        if(flag == 2){
            System.out.println((num1[0]-sum) + " " + back);
        }

    }
}
