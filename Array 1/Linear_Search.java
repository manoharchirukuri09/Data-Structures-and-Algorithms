import java.util.*;
public class Linear_Search {
    public static int Linear_Search(int num[],int key){
        for(int i=0;i<num.length;i++){
            if(num[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int num[]= {1,2,3,4,5,6,7,8,9,10};
        System.out.println("Enter the Key Value: " );
        int key= sc.nextInt();
        int result = Linear_Search(num, key);
        if(result == -1){
            System.out.println("Key Not Found");
        }else{
            System.out.println("Key Found at Index:" + result);
        }
    }
}


