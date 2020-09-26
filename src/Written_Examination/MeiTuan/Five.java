package Written_Examination.MeiTuan;

import java.util.Arrays;
import java.util.Scanner;

public class Five {

    // 先列出数学公式，然后化简
    // 分析可以知道有三种情况需要讨论
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int x= sc.nextInt();
        int y = sc.nextInt();
        int[] strength = new int[x + y];
        for (int i= 0; i < x + y; i++){
            strength[i] = sc.nextInt();
        }

        // 分三种情况
        if(x == y){
            // 按顺序输出AA...BB...
            StringBuffer out = new StringBuffer();
            for(int i = 0; i < x; i++){
                out.append("A");
            }
            for(int i = 0; i < y; i++){
                out.append("B");
            }
            System.out.println(out);
        }
        else if(x < y){
            // 此时尽量使A队的平均实力高
            char[] ch = new char[x + y];
            Arrays.fill(ch, 'B');
            // 寻找最大的x个数，将B改为A
            for(int i = 0; i < x; i++){
                int max = 0;
                for(int j = 0; j < x + y; j++){
                    if(strength[max] < strength[j]){
                        max = j;
                    }
                }
                strength[max] = 0;
                ch[max] = 'A';
            }
            System.out.println(ch.toString());
        }
        else {
            // 此时尽量使A队的平均实力低
            char[] ch = new char[x + y];
            Arrays.fill(ch, 'B');
            // 寻找最小的x个数，将B改为A
            for(int i = 0; i < x; i++){
                int min = 20001;
                for(int j = 0; j < x + y; j++){
                    if(strength[min] > strength[j]){
                        min = j;
                    }
                }
                strength[min] = 20001;
                ch[min] = 'A';
            }
            System.out.println(ch.toString());
        }

    }
}
