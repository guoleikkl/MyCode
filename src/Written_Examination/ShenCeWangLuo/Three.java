package Written_Examination.ShenCeWangLuo;

import java.util.Scanner;

public class Three {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String filter = sc.nextLine();

//        ArrayList<String> list1 = new ArrayList<>();
//        ArrayList<String> list2 = new ArrayList<>();
        String s1 = null;
        String s2 = null;
        while(sc.hasNextLine()){

            s1 = sc.nextLine();

            String[] str = s1.split("\\t");
            if(str[1].equals(filter)){
                System.out.println(s1);

            }
        }


    }

}
//Thread-1
//        2017-03-10 10:00:00	Thread-1	start running thread 1
//        2017-03-10 10:00:01	Thread-2	start running thread 2
//        2017-03-10 10:00:02	Thread-2	thread 2 exit
//        2017-03-10 10:00:04	Thread-1	thread 1 exit