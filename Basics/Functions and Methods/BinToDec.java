
import java.util.*;
public class BinToDec {
    public static void BinToDec(int n){
        int mynum = n;
        int dec = 0;
        int pow =0;
        while(n>0){
            int rem = n%10;
           dec = dec + (rem *(int) Math.pow(2,pow));
          pow++;
          n = n/10;
    }
    System.out.println("BinNum " + mynum + " = " + dec);
}
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Binary Value: ");
    int n = sc.nextInt();
    BinToDec(n);
}

}



