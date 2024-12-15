import java.util.*;
public class Pass_Or_Fail {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter your marks ");
       int marks = sc.nextInt();
        String result = (marks >= 33) ? "Pass" : "Fail";
        System.out.println(result);
    }
}

