package Written_Examination.WangYi;


import java.util.ArrayList;
import java.util.Scanner;

/*
* 借用插入排序的思想
* 将序列T当做已将排好序的数组
* 将0-n中未出现的数字依次插入
 */
public class Two {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        ArrayList<Integer> nums = new ArrayList<>();
        ArrayList<Integer> result = new ArrayList<>();


        for(int i = 0; i < m; i++) {
            nums.add(sc.nextInt());
        }

        // 特殊情况 m=n
        if(m == n){
            show(nums);
        }

        int max = 0;
        for(Integer i : nums){
            if(i>max){
                max = i;
            }
        }

        for(int i = 1; i <= n; i++) {
            if(i > max){
                nums.add(i);
                max = i;
            }
            if(nums.contains(i)){
                continue;
            }
            if(i < nums.get(0)){
                    nums.add(0, i);
//                    show(nums);
                    continue;
            }
            else{
                boolean b = false;
                for(int j = 0; j < nums.size()-1; j++){
                    if(i>nums.get(j) && i<nums.get(j+1)){
                        nums.add(j+1, i);
                        b = true;
//                        show(nums);
                        break;
                    }
                }
                if(b == false){
                    nums.add(i);
                }
//

            }
        }
        show(nums);

    }

    // 输出数组
    public static void show(ArrayList<Integer> arr){
        for(int i = 0; i < arr.size()-1; i++){
            System.out.print(arr.get(i)+" ");
        }
        System.out.println(arr.get(arr.size()-1));
    }

}
