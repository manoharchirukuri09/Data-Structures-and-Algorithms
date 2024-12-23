import java.util.*;
public class Input_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the Array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of the Array: ");
        for(int i=0;i<=n;i++){
            arr[i] = sc.nextInt();
            System.out.println("The Element name: " + arr[i]);
        }     
    }
}

