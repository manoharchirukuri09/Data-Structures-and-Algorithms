import java.util.*;
public class Update_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of the Array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        arr[0]= 90;
        arr[1]= 85;
        arr[2]=95;
        System.out.println("Physics marks " + arr[0]);
        System.out.println("Chemistry marks " + arr[1]);
        System.out.println("Maths marks " + arr[2]);
        //update the arr[2] is +1;
        arr[2]= arr[2]+1;
        
        System.out.println("The update Arrray Element: " + arr[2]);
    }
}

