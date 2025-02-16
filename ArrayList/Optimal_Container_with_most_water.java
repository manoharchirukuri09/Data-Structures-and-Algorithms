import java.util.*;
public class Optimal_Container_with_most_water {
    public static int MostWater(ArrayList<Integer> height){
        int maxwater =0;
        int left =0;
        int right = height.size()-1;
        while(left<right){
            // height
            int hg = Math.min(height.get(left), height.get(right));
            // width
            int width = right - left;
            int currwater = hg*width;
            maxwater = Math.max(maxwater,currwater);
            if(left<right){
                left++;
            }else{
                right--;
            }
        }
        return maxwater;

    }
    public static void main(String[] args){
        ArrayList<Integer> height= new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);
        System.out.println(MostWater(height));
    
    }
}
