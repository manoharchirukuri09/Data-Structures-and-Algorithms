import java.util.*;
public class Sub_String {
    public static String substring(String str, int start, int end){
        String substring = "";
        for(int i=start;i<=end;i++){
            substring += str.charAt(i);
        }
        return substring;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str = sc.nextLine();
        System.out.println("Enter the start index: ");
        int start = sc.nextInt();
        System.out.println("Enter the end index: ");
        int end = sc.nextInt();
        System.out.println("The substring is: "+substring(str, start, end));
    }
}
