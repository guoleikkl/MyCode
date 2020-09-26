package Written_Examination.PinDuoDuo;

import java.util.Scanner;

public class Two {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int input = Integer.parseInt(sc.nextLine());

        int[][] arr = new int[input][6];

        for(int i = 0; i <input; i++){
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
            arr[i][2] = sc.nextInt();
            arr[i][3] = sc.nextInt();
            arr[i][4] = sc.nextInt();
            arr[i][5] = sc.nextInt();
        }

        for(int i = 0; i < input; i++){
            for(int j = i; j < input; j++){

            }
        }



    }





}
