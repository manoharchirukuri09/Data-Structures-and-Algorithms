import java.util.*;
public class Pair_Sum_1 {
    public static boolean Pair_Sum(ArrayList<Integer> list,  int target){
        for(int i=0;i<list.size();i++){
            for(int j=i+1;j<list.size();j++){ 
                    if(list.get(i) + list.get(j) == target){
                        return true;
                    }
        }
    }
    return false;
}
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        int target =5;
        for(int i=1;i<=6;i++){
            list.add(i);
        }
        boolean result=Pair_Sum(list, target);
        System.out.println(result);
    }
}
