/*
package Written_Examination.QiAnXin;

import java.util.*;


public class One {
    */
/**
     *
     * @param num_money int整型 奖金的总数,单位为元
     * @return int整型
     *//*

    public int CalulateMethodCount (int num_money) {
        // write code here

        Construct[][] tempConstruct = new Construct[num_money+1][];

        HashSet<String> res = new HashSet<>();

        tempConstruct[0] = null;
        tempConstruct[1] = null;

        for(int i = 2; i <= num_money; i++){
            tempConstruct[i] = new Construct[i-1];
            int index = 0;
            for(int j = 1; j < i; j++){
                StringBuilder str = new StringBuilder();
                for(int k = 0; k < (num_money-i); k++){
                    str.append("1+");
                }

                tempConstruct[i][index++] = new One.Construct(j, i-j, str.length()>0 ? str.toString().substring(0,str.length()-1):str.toString());

            }
        }




    }

    static class Construct{
        int left;
        int right;
        String complement;
        public Construct(int left, int right, String complement){
            this.left = left;
            this.right = right;
            this.complement = complement;
        }

        @Override
        public String toString() {
            return "Construct{" +
                    "left=" + left +
                    ", right=" + right +
                    ", complement='" + complement + '\'' +
                    '}';
        }

        public int getLeft() {
            return left;
        }

        public void setLeft(int left) {
            this.left = left;
        }

        public int getRight() {
            return right;
        }

        public void setRight(int right) {
            this.right = right;
        }

        public String getComplement() {
            return complement;
        }

        public void setComplement(String complement) {
            this.complement = complement;
        }
    }
}*/
