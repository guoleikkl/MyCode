package Written_Examination.QiAnXin;


public class One_2 {

    public static void main(String[] args){
        One_2 oo = new One_2();
        System.out.println(oo.CalulateMethodCount(6));
    }

    /**
     *
     * @param num_money int整型 奖金的总数,单位为元
     * @return int整型
     */
    public int CalulateMethodCount (int num_money) {
        // write code here



        return (int)Math.pow(2,num_money-1);
    }
}

