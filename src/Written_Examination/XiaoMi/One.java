package Written_Examination.XiaoMi;

import java.util.Scanner;

public class One {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] passwords = input.split(" ");

        for(String password : passwords){
            System.out.println(judgePassword(password));
        }


    }

    private static int judgePassword(String str){
        if(str.length() < 8 || str.length() > 120){
            // 长度不符合要求
            return 1;
        } else {
            // 长度符合要求
            boolean digit = false;
            boolean upperCase = false;
            boolean lowerCase = false;
            boolean symbol = false;
            for(int i = 0; i < str.length(); i++){
                if(Character.isDigit(str.charAt(i)) && !digit){
                    digit = true;
                }
                else if(Character.isUpperCase(str.charAt(i)) && !upperCase){
                    upperCase = true;
                }
                else if(Character.isLowerCase(str.charAt(i)) && !lowerCase){
                    lowerCase = true;
                }
                else{
                    symbol = true;
                }
            }
            if(digit && upperCase && lowerCase && symbol){
                return 0;
            }else{
                return 2;
            }
        }
    }

}
