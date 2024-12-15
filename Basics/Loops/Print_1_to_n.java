import java.util.*;
public class Print_1_to_n {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        int count = 0;
        while(count<=n){
            System.out.print(count+ " ");
            count++;
        }
        
    }
}

