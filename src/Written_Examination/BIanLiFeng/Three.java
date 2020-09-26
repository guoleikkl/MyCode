package Written_Examination.BIanLiFeng;

import java.util.Scanner;

public class Three {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        StringBuffer result = new StringBuffer();
        for(int i = 0; i < input.length(); i++){
            if((i + 1) % 2 == 1){
                int n = Integer.parseInt(String.valueOf(input.charAt(i)));
                char c = input.charAt(i + 1);
                solution(result, n, c);
            }
        }
        System.out.println(result);
    }

    private static void solution(StringBuffer sb, int n, char c){
        for(int i = 0; i < n; i++){
            sb.append(c);
        }
    }

}
