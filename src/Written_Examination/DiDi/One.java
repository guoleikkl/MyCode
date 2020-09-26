package Written_Examination.DiDi;

import java.util.Scanner;

public class One {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = Integer.parseInt(sc.nextLine());
        String input = sc.nextLine();
        StringBuffer res = new StringBuffer();

        // 将字符串按照长度一节一节反转，存储到StringBuffer中
        // 末尾不反转
        int i = 0;
        while(i + num - 1  < input.length() ){
            reverseSubStr(input, i, i + num - 1 , res);
            i = i + num ;
        }

        // 反转末尾
        reverseSubStr(input, i, input.length() - 1, res);
        System.out.println(res);
    }

    private static void reverseSubStr(String str, int i, int j, StringBuffer res){
        while(j >= i){
            res.append(str.charAt(j--));
        }
    }

}
