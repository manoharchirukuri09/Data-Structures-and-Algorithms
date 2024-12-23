import java.util.*;
public class Function_Argument {
    public static void Update_Array(int[] marks){
         marks[2] += 1;
         System.out.println("The update marks : " + marks[2]);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: " );
        int n = sc.nextInt();
        int marks[] =new int[n];
        marks[0] = 90;
        marks[1] = 80;
        marks[2] = 70;
        Update_Array(marks);
    }
}
