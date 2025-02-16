import java.util.*;
public class Pair_Sum_2 {
    public static boolean Pair_Sum(ArrayList<Integer> list, int target){
        int bp = -1;
        int n = list.size();
        for(int i=0;i<list.size()-1;i++){
            if(list.get(i)> list.get(i+1)){
                bp = i;
                break;
            }
        }
        int left = bp+1;
        int right = bp;
        while(left != right){
            if(list.get(left) + list.get(right) == target){
                return true;
            }else if(list.get(left) + list.get(right) < target){
                left = (left + 1)%n;
            }else{
                right = (n + right -1)%n;
            }
        }
        return false;
    }
  public static void main(String[] args){
    ArrayList<Integer> list = new ArrayList<>();
    list.add(11);
    list.add(15);
    list.add(6);
    list.add(8);
    list.add(9);
    list.add(10);
    int target = 16;
    boolean result = Pair_Sum(list, target);
    System.out.println(result);
  }  
}
