import java.util.*;
public class Ones_Zeros_Triangle {
    public static void Ones_Zeros_Triangle(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if((i+j) % 2==0){
                    System.out.print("1 ");
                }else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int n = sc.nextInt();
        Ones_Zeros_Triangle(n);
    }
}
