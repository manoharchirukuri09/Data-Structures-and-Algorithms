import java.util.*;
public class Break_Statement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            if(i % 10 ==0){
                break;
            }
            System.out.println(i);
        }
        System.out.println("Hello world");
       
    }
}

