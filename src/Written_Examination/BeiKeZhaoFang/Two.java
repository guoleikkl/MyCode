package Written_Examination.BeiKeZhaoFang;

import java.util.Scanner;

public class Two {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();



        for(int i = 0; i < num; i++){
            long n = sc.nextInt();
            long m = sc.nextInt();

            if(n*m == 1){
                System.out.println(1);
            }else{
                System.out.println(2);
            }
        }

    }

}
