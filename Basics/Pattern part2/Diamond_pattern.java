import java.util.*;
public class Diamond_pattern {
    public static void Diamond_pattern(int n){
        //1st half
        //outer looop
        for(int i=1;i<=n;i++){
            //spaces + stars
            //spaces 
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i -1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //2nd half
        for(int i=n;i>=1;i--){
            //spaces + stars
            //spaces 
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i -1;j++){
                System.out.print("*");
        }
        System.out.println();
    }
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int n = sc.nextInt();
        Diamond_pattern(n);
    }
}

