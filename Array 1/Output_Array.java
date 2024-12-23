import java.util.*;
public class Output_Array {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of the Array: ");
    int n = sc.nextInt();
      int arr[] =new int[n] ;
    arr[0] = 90;
    arr[1] = 80;
    arr[2] = 70;
    arr[3] = 60;
    System.out.println("Physics marks " + arr[0]);
    System.out.println("Chemistry marks " + arr[1]);
    System.out.println("Maths marks " + arr[2]);
    System.out.println("Science marks " + arr[3]);
  }
}  

