package Written_Examination.JingDong;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class One {

    public static void main(String[] args){

        ArrayList<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        for(int i = 0; i < input.length(); i++){
            if(Character.isDigit(input.charAt(i)) && (i == 0 || input.charAt(i - 1) == ' ')){
                int num = getNum(input, i);

                if(num <= 3999 && num >= 1000){
                    list.add(num);
                }
                i += String.valueOf(num).length() - 1;
            }
        }
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        set.addAll(list);
        list.clear();
        list.addAll(set);

        for(int i = 0; i < list.size() - 1; i++){
            System.out.print(list.get(i) + " ");
        }
        System.out.println(list.get(list.size() - 1));


    }

    public static int getNum(String str, int where){
        StringBuilder res = new StringBuilder();
        while(where < str.length() && Character.isDigit(str.charAt(where)) ){
            res.append(str.charAt(where++));
        }
        return Integer.parseInt(res.toString());
    }

}
