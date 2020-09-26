package Written_Examination.VIPKID;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class One {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
//        int caseNum = sc.nextInt();
//        int[][] k_n = new int[caseNum][2];
//
//        for(int i = 0; i < caseNum; i++){
//            k_n[i][0] = sc.nextInt();
//            k_n[i][1] = sc.nextInt();
//        }

//        for(int i = 0; i < caseNum; i++){
//            solution(k_n[i][0], k_n[i][1]);
//        }

        solution(2, 6);

    }

    private static List<List<Integer>> solution(int k, int n){
        List<List<Integer>> list = new ArrayList<>();
        for(int i = 0; i < k; i++){
            if(i == 0){
                for(int j = 1; j < n; j++){
                    List<Integer> li = new ArrayList<>();
                    li.add(j);
                    list.add(li);
                }
                continue;
            }
            List<List<Integer>> listNew = new ArrayList<>();
            for(List<Integer> integers : list){
                for(int j = integers.get(integers.size() - 1); j < n; j++){
                    List<Integer> li = new ArrayList<>();
                    li.add(j);
                    list.add(li);
                    if(i + 1 == k){
                        int res = 0;
                        for(Integer integer : li){
                            res += integer;
                        }
                        if(res != n){
                            listNew.remove(li);
                        }
                    }
                }
            }
            list.clear();
            list.addAll(listNew);
        }
        for(List<Integer> integers : list){
            for(Integer integer : integers){
                System.out.println(integer + "\t");
            }
            System.out.println();
        }
        return list;
    }
}
