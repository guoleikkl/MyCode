package Written_Examination.ALiBaBa;

import java.util.Scanner;

public class Two {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        String strT = sc.nextLine();
        int numT = Integer.valueOf(strT);

        //System.out.println(strT);////////////////////////////////////


      String[] input = new String[numT];

        for(int i=0;i<input.length;i++){
            input[i] = sc.nextLine();
            //System.out.println(input[i]);///////////////////////////
            System.out.println(solution(input[i]));
        }
//System.out.println(jisuan(numT));

        //System.out.println(solution());



    }

    public static int solution(String input){

        String[] str = input.split(" ");
        int l = Integer.valueOf(str[0]);
        int r = Integer.valueOf(str[1]);

        //System.out.println("l:"+l+"  r:"+r);///////////////////

        int temp = 0;
        boolean b = false;
        for(int i = l;i<=r;i++){
            b=jisuan(i);
            if(b){
                temp++;
            }
        }
        return temp;
    }

    public static boolean jisuan(int num){
        String str = String.valueOf(num);
        //System.out.println(str);//////////////////////
/*        char[] ch = str.toCharArray();
        int[] nums = new int[ch.length];
        for(int i =0;i<ch.length;i++){
            nums[i] = Integer.valueOf(ch[i]);
        }*/

        int[] nums = new int[str.length()];

        for(int i = 0;i<nums.length;i++){
            //System.out.println(str.charAt(i));
            //nums[i] = ((int) (num/Math.pow(10,nums.length-1-i)));
            nums[i] = Integer.parseInt(String.valueOf(str.charAt(i)));
            //System.out.println(nums[i]);
        }
        //nums[nums.length-1]= num%10;



        int result = 0;

        for(int i =0;i<nums.length;i++){
            //System.out.println(nums[i]);/////////////////////////////
            result = Math.abs(result - nums[i]);

        }

        if(result == 7){
            return true;
        }else{
            return false;
        }


    }



}
