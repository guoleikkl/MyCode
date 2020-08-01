package Basic.Sort;

public class Sort_Test {

    public static void main(String[] args){
        Sort sort = new Quick_Sort();
        int[] array = {4,34,6,342,-33,-45,654,2,45,66,543,-2435,4567,32,0,54,4,75,7234,345,22};
        int[] aaa = sort.sort(array);
        for(int i=0;i<aaa.length;i++){
            System.out.println(aaa[i]);
        }
    }
}
