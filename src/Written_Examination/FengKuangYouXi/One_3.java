package Written_Examination.FengKuangYouXi;

import java.util.Scanner;
import java.util.Stack;

public class One_3 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();



    }


    private static String getStr(String string){
        StringBuilder result = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < string.length(); i++){
            if(Character.isDigit(string.charAt(i))){
                int j = i;
                for( ; j < string.length(); j++){
                    if(!Character.isDigit(string.charAt(j))){
                        break;
                    }
                }
                int n = Integer.parseInt(string.substring(i, j));

//                stack.push(string.charAt(j++));
                for(int k = j; k < string.length(); k++){
                    if(string.charAt(k) != ']'){
                        stack.push(string.charAt(k));
                    }else{
                        StringBuilder buff = new StringBuilder();
                        while(!stack.isEmpty()){
                            if(stack.peek() != '['){
                                buff.append(stack.pop());
                            }else{
                                break;
                            }
                        }
                        stack.pop();
                        buff.reverse();
                    }
                }





            }else{
                result.append(string.charAt(i));
            }
        }
        return result.toString();
    }




    private static void addStr(StringBuilder result, int n, String str){
        for(int i = 0; i < n; i++){
            result.append(str);
        }
    }
}


