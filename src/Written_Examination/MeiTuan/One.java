package Written_Examination.MeiTuan;

import java.util.Scanner;

public class One {

    public static void main(String[] args){

        // 获取输入
        Scanner sc = new Scanner(System.in);
        int num = Integer.parseInt(sc.nextLine());
        String[] input = new String[num];
        for(int i = 0; i < num; i++){
            input[i] = sc.nextLine();
        }

        // 对每个输入进行判断

        for(int i = 0; i < num; i++){
            // 判断首字符是否为字母
            if(!Character.isLetter(input[i].charAt(0))){
                // 不为字母，输出wrong
                System.out.println("Wrong");
                continue;
            }else{
                // 为字母，继续
                boolean b = false;
                for(int j = 1; j < input[i].length(); j++){
                    // 判断有数字且无其他字符
                    if(Character.isDigit(input[i].charAt(j))){
                        // 为数字
                        b = true;
                    }
                    else if(!Character.isLetter(input[i].charAt(j))){
                        // 不为数字也不为字母
                        //System.out.println("Wrong");
                        b = false;
                        break;
                    }
                }
                if(b==true){
                    System.out.println("Accept");
                }else{
                    System.out.println("Wrong");
                }

            }
        }

    }

}
