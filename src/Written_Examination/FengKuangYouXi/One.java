package Written_Examination.FengKuangYouXi;

import java.util.Scanner;

public class One {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        StringBuilder result = new StringBuilder();

        for(int i = 0; i < input.length(); i++){
            if(Character.isDigit(input.charAt(i))){
                int j = i;
                for( ; j < input.length(); j++){
                    if(!Character.isDigit(input.charAt(j))){
                        break;
                    }
                }
                int n = Integer.parseInt(input.substring(i, j));
                int k = j + 1;
                while(input.charAt(k) != ']'){
                    k++;
                }
                String str = input.substring(j + 1, k);
                addStr(result, n, str);
                i = k;
            }
        }

        System.out.println(result);
    }

    private static void addStr(StringBuilder result, int n, String str){
        for(int i = 0; i < n; i++){
            result.append(str);
        }
    }

}
