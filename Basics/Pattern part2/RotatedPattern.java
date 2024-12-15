import java.util.*;
public class RotatedPattern {
    public static void Rotated_pattern(int n){
        //outer loop
        for(int i=1;i<=n;i++){
            //inner loop
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
        }
        //stars
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
        System.out.println();
    }
}
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the number of rows:");
       int n = sc.nextInt();
       Rotated_pattern(n);
    }
}
