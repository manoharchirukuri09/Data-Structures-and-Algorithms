import java.util.*;
public class Max_Rectangular_Area {
    public static void maxArea(int arr[]){
        int n = arr.length;
        int maxArea=0;
        int nsr[] = new int[n];
        int nsl[] = new int[n];
        // Next smaller right 
        Stack<Integer> s = new Stack<Integer>();
        for(int i=arr.length-1;i>=0;i--){
            while(!s.isEmpty() && arr[s.peek()]>=arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nsr[i] = arr.length;
            }else{
                nsr[i] = s.peek();
            }
            s.push(i);
        }
        // Next smaller left
        s = new Stack<Integer>();
        for(int i=0;i<arr.length;i++){
            while(!s.isEmpty() && arr[s.peek()]>=arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nsl[i]=-1;
            }else{
                nsl[i] = s.peek();
            }
            s.push(i);
        }
        // current AREA = height * width = j-i-1 
        for(int i=0;i<arr.length;i++){
            int height = arr[i];
            int width = nsr[i] - nsl[i] - 1;
            int currArea = height * width;
            maxArea = Math.max(maxArea, currArea); 
        }
        System.out.println("maxArea: " + maxArea);
    }
    public static void main(String[] args) {
      int arr[] = {2,1,5,6,2,3};
      maxArea(arr);  
    }
}

