package Written_Examination.PinDuoDuo;


import java.util.Scanner;

/*
 * 能达到的两种情况
 *  0. 只吃一顿饭，吃一碗
 *  1. 只吃一顿饭，吃两碗
 *  2. 中午一碗，晚上一碗
 *
 * 特殊情况
 * T = 0
 * 输出0
 *
 */
/*
 * 情况2
 * 暴力解决法
 */
public class Three {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input1 = sc.nextLine();
        // 将第一行输入转换成数组
        String[] strArr1 = input1.split(" ");
        int[] num1 = new int[strArr1.length];
        for(int i = 0; i < strArr1.length; i++) {
            num1[i] = Integer.parseInt(strArr1[i]);
        }

        int len = num1[0]+num1[1];
        int[][] inputarr = new int[len][2];

        for(int i = 0; i < len; i++){
            inputarr[i][0] = sc.nextInt();
            inputarr[i][1] = sc.nextInt();
            //System.out.println("i="+i+" "+inputarr[i][0]+" "+inputarr[i][1]);
        }

        // 特殊情况
        if(num1[2] == 0){
            System.out.println("0");
            return;
        }

        // 保存最少热量
        int min = Integer.MAX_VALUE;
        boolean b = false;

        // 情况0
        for(int i = 0; i < len; i++){
            if(inputarr[i][1] >= num1[2] && (min > (inputarr[i][0]))){

                b = true;
                min = inputarr[i][0];

            }
        }

/*        if(b){
            System.out.println(min);
            return;
        }*/

        int max = 0;
        for(int j = num1[0]; j < len; j++){
            if(inputarr[j][1] > max){
                max = inputarr[j][1];
            }
        }

        // 情况2
        for(int i = 0; i < num1[0]; i++){
            if(inputarr[i][1] + max < num1[2]){
                break;
            }else{
                for(int j = num1[0]; j < len; j++){
                    if((inputarr[i][1] + inputarr[j][1]) >= num1[2] && (min > (inputarr[i][0] + inputarr[j][0]))){
                        b = true;
                        min = (inputarr[i][0] + inputarr[j][0]);
                    }
                }
            }
        }
        if(b){
            System.out.println(min);
        }else{
            System.out.println(-1);
        }
    }

}
