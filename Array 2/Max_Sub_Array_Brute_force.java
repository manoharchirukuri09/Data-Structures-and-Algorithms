public class Max_Sub_Array_Brute_force {
    public static void Max_SubArray(int arr[]){
        int max_sum = Integer.MIN_VALUE;
        int curr_sum =0;
        for(int i=0;i<arr.length;i++){
            int start =i;
            for(int j=i;j<arr.length;j++){
                int end = j;
                curr_sum = 0;
            for(int k=start;k<=end;k++){
                curr_sum = curr_sum + arr[k];
            }
            if(curr_sum>max_sum){
                max_sum = curr_sum;
            }
        }
  }
  System.out.println("The maximum sub array sum  is  " + max_sum); 
}
public static void main(String[] args){
    int[] arr = {2,4,6,8,10};
    Max_SubArray(arr);
}
}
