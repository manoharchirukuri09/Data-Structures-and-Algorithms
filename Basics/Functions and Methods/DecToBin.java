import java.util.*;
public class DecToBin {
    public static void DecToBin(int n){
        int mynum= n;
        int binum=0;
        int pow=0;
        while(n>0){
            int rem=n%2;
            binum = binum + rem*(int) Math.pow(10,pow);
            pow++;
            n=n/2;
        }
        System.out.println("binum " +  mynum + " = " + binum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Decimal Number: ");
        int n = sc.nextInt();
        DecToBin(n);
    }
}

