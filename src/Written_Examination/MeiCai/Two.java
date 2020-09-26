package Written_Examination.MeiCai;

import java.util.Scanner;

public class Two {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        System.out.println(strToInt(input));


    }

    private static int strToInt(String str){
        int begin = 0;
        while(begin < str.length()){
            if(str.charAt(begin) != ' '){
                break;
            }
            begin++;
        }

        if(begin == str.length()) {
            return 0;
        }
        if(str.charAt(begin) == '-'){
            int res = getNum(begin + 1, str);
            res = -res;
            return res;
        }
        else if(str.charAt(begin) == '+'){
            return getNum(begin + 1, str);
        }
        else if(Character.isDigit(str.charAt(begin))){
            return getNum(begin, str);
        }
        return 0;

    }

    private static int getNum(int begin, String str){
        if(begin == str.length()){
            return 0;
        }
        StringBuilder res = new StringBuilder();
        for(int i = begin; i < str.length(); i++){
            if(Character.isDigit(str.charAt(i))){
                res.append(str.charAt(i));
            }else{
                break;
            }
        }
        return Integer.parseInt(new String(res));
    }

}
