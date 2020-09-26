package Written_Examination.QiAnXin;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Two {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        if(input.equals("")){
            System.out.println("");
            return;
        }

        ArrayList<Integer> list = new ArrayList<>();
        Integer[] ii = (Integer[]) list.toArray();


        String[] inArr = input.split(" |\\t");

        Stack<String> tem = new Stack<>();
        String tt = "";
//        String result = "";
        Stack<String> result = new Stack<>();
        for(int i = 0; i < inArr.length; i++){
            if( !result.isEmpty() && inArr[i].equals("undo")){
                tem.push(result.pop());
            }
            else if( !tem.isEmpty() && inArr[i].equals("redo")){
                result.push(tem.pop());
            }
            else if( !inArr[i].equals("undo") && !inArr[i].equals("redo")){
                result.push(inArr[i]);
            }
        }

        String fi = "";
        for(String str : result){
            fi += str + " ";
        }
        fi = fi.substring(0,fi.length()-1);
        System.out.println(fi);


/*        for(int i = 0; i < inArr.length; i++){
            if(inArr[i].equals("undo")){
                tem = new String(tt);
                tt = "";
            }
            else if(inArr[i].equals("redo")){
                tt = new String(tem);
                tem = "";
            }
            else{
                if(!tt.equals(""))
                    result = result + tt + " ";
                tt = new String(inArr[i]);
            }
        }

        result = result + tt;

        System.out.println(result);*/
    }

}
