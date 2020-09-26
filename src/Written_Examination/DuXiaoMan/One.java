package Written_Examination.DuXiaoMan;

import java.util.HashMap;
import java.util.Scanner;

public class One {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String color = sc.nextLine();
        String block = sc.nextLine();

        HashMap<Character, Integer> colors = new HashMap<>();
        HashMap<Character, Integer> blocks = new HashMap<>();

        // 用HashMap来存储每种颜色的剩余量
        for(int i = 0; i < color.length(); i++){
            char c = color.charAt(i);
            if(colors.containsKey(c)){
                colors.put(c, colors.get(c));
            }else{
                colors.put(c, 1);
            }
        }

        int count = 0;
        for(int i = 0; i < block.length(); i++){
            char c = block.charAt(i);
            if(colors.containsKey(c) && colors.get(c) > 0){
                colors.put(c, colors.get(c) - 1);
                count++;
            }
        }

        System.out.println(count);
    }

}
