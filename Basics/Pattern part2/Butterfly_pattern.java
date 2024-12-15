import java.util.*;
public class Butterfly_pattern {
    public static void Butterfly_pattern(int n){
        //1st half
        //outer loop
        for(int i=1;i<=n;i++){
            //stars + spaces + stars 
            //stars 
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            //spaces
            for(int j=1;j<=2*(n-i);j++){
                System.out.print("  ");
            }
            //stars
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        //2nd half
        //outer loop
        for(int i=n;i>=1;i--){
            //stars + spaces + stars
            //stars
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            //spaces
            for(int j=1;j<=2*(n-i);j++){
                System.out.print("  ");
            }
            //stars
            for(int j=1;j<=i;j++){
                System.out.print("* ");
        }
        System.out.println();

    }
}
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of rows: ");
    int n = sc.nextInt();
    Butterfly_pattern(n);
}
}
