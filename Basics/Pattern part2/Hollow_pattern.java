import java.util.*;
public class Hollow_pattern {
    public static void Hollow_pattern(int rows,int cols){
        //outer loop
        for(int i=1;i<=rows;i++){
            //inner loop
            for(int j=1;j<=cols;j++){
                if(i==1 || i==rows || j==1 || j==cols){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int rows = sc.nextInt();
        System.out.println("Enter the number of columns: ");
        int cols = sc.nextInt();
        Hollow_pattern(rows,cols);
    }
}
