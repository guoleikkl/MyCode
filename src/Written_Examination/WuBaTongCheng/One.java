package Written_Examination.WuBaTongCheng;

import java.util.*;

public class One {

    /**
     * 使用Set
     * @param values string字符串ArrayList<ArrayList<>>
     * @return string字符串ArrayList
     */

    public ArrayList<String> findCommonString (ArrayList<ArrayList<String>> values) {
        // write code here

        Map<String, Integer> map = new LinkedHashMap<>();
//        for(String str : values.get(0)){
//            map.put(str, 1);
//        }

//        for(int i = 1; i < values.size(); i++){
//            for(String key : map.keySet()){
//                if(values.get(i).contains(map.get(key))){
//
//                }
//            }
//        }


        for(ArrayList list : values){
            for(int i = 0; i < list.size(); i++){
                Set<Integer> set = new LinkedHashSet<>();
                set.addAll(list);
                list.clear();
                list.addAll(set);
                if(!map.containsKey(list.get(i))){
                    map.put((String) list.get(i), 1);
                }else{
                    map.put((String) list.get(i), map.get(list.get(i)) + 1);
                }
            }
        }
        int num = values.size();
        ArrayList<String> result = new ArrayList<>();
        for(String key : map.keySet()){
            if(map.get(key) == num){
                result.add(key);
            }
        }

        return result;

    }

}
