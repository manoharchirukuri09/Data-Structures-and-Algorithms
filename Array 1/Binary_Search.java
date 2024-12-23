import java.util.*;
public class Binary_Search {
    public static int binarySearch(int[] num,int key){
        int start =0;
        int end = num.length-1;
        while(start<=end){
            int mid = (start + end)/2;
            if(num[mid]==key){
                return mid;
            }else if(num[mid]>key){
                end = mid -1;
            }else{
                start = mid +1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int num[] = {2,4,6,8,10,12,14};
       System.out.println("Enter the key Value : ");
       int key = sc.nextInt();
       int result = binarySearch(num, key);
       if(result==-1){
        System.out.println("Key value is not Found");
       }else{
        System.out.println("The Key Found at Index: " + result);
       }

    }
}

