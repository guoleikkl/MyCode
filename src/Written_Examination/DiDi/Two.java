package Written_Examination.DiDi;

import java.util.ArrayList;
import java.util.Scanner;

public class Two {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int num = Integer.parseInt(sc.nextLine());// 输入的组数

        ArrayList<ArrayList<String>> input = new ArrayList<>();
        int[][] n_m_k = new int[num][3];
        for(int i = 0; i < num; i++){
            String[] strArr = sc.nextLine().split(" ");
            for(int j = 0; j < 3; j++){
                n_m_k[i][j] = Integer.parseInt(strArr[j]);
            }
            ArrayList<String> al = new ArrayList<>();
            for(int j = 0; j < n_m_k[i][1]; j++){
                al.add(sc.nextLine());
            }
            input.add(al);
        }

        for(int i = 0; i < num; i++){
            if(judge(n_m_k[i][0], n_m_k[i][1], n_m_k[i][2], input.get(i))){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }










    }

    private static boolean judge(int n, int m, int k, ArrayList<String> list){
        ArrayList<ArrayList<Integer>> al = new ArrayList<>();
        for(int i = 0; i < list.size(); i++){
            int[] arr = new int[3];
            String[] strArr = list.get(i).split(" ");
            for(int j = 0; j < 3; j++){
                arr[j] = Integer.parseInt(strArr[j]);
            }

            if(arr[2] > k){
                break;
            }else{
                if(al.size() == 0){
                    ArrayList<Integer> arrayList = new ArrayList();
                    arrayList.add(arr[0]);
                    arrayList.add(arr[1]);
                    al.add(arrayList);
                }else{
                    int where0 = -1;
                    int where1 = -1;
                    for(int q = 0; q < al.size(); q++){
                        if(al.get(q).contains(arr[0]) && !al.get(q).contains(arr[1])){
//                            al.get(q).add(arr[1]);
                            where0 = q;
                        }
                        else if(al.get(q).contains(arr[1]) && !al.get(q).contains(arr[0])){
//                            al.get(q).add(arr[0]);
                            where1 = q;
                        }
                        else if(al.get(q).contains(arr[1]) && al.get(q).contains(arr[0])){
                            where0 = q;
                            where1 = q;
                        }

                        if(where0 > -1 && where1 == -1){
                            al.get(where0).add(arr[1]);
                        }
                        else if(where0 == -1 && where1 > -1){
                            al.get(where1).add(arr[0]);
                        }
                        else if(where0 == -1 && where1 == -1){
                            ArrayList<Integer> arrayList = new ArrayList<>();
                            arrayList.add(arr[0]);
                            arrayList.add(arr[1]);
                            al.add(arrayList);
                        }
                        else if(where0 > -1 && where1 > -1 && where0 != where1){
                            al.get(where0).addAll(al.get(where1));
                            al.remove(where1);
                        }

                    }
                }

            }
        }

        if(al.size() > 1){
            return false;
        }else{
            for(int i = 1; i < n; i++){
                if(!al.get(0).contains(i)){
                    return false;
                }
            }
            return true;
        }
    }

}
