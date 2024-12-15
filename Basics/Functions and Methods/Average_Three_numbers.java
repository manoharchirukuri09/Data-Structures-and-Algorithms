import java.util.*;
public class Average_Three_numbers {
    public static int Average(int a,int b, int c){
        int avg = (a+b+c)/3;
        return avg;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = sc.nextInt();
        System.out.println("Enter the second number");
        int b = sc.nextInt();
        System.out.println("Enter the third number");
        int c = sc.nextInt();
        int avg = Average(a,b,c);
        System.out.println("The average of the three numbers: " + avg);
    }
}

