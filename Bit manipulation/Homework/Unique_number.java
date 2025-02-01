import java.util.*;
public class Unique_number {
    public static int unique(int n){
        int result = n^n;
        return result;
    }
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        int unique_num = unique(num);
        System.out.println("Unique number is: "+unique_num);
    }
    
}
