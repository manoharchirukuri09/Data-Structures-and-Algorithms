import java.util.*;
public class Optimal_Pair_Sum_1 {
    public static boolean pair_Sum(ArrayList<Integer> list, int target){
        int left =0;
        int right =list.size()-1;
        while(left<right){
            if(list.get(left) + list.get(right) == target){
                return true;
            }else if(list.get(left) + list.get(right) < target){
                left++;
        }else {
            right--;
    }
}
return false;
    }
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        int target =50;
        for(int i=1;i<=6;i++){
            list.add(i);
        }
        boolean result = pair_Sum(list, target);
        System.out.println(result);
    }
}
