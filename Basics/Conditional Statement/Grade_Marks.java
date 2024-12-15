import java.util.*;
public class Grade_Marks {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter your marks");
       int marks = sc.nextInt();
       if(marks >= 90 && marks <= 100) {
        System.out.println(  marks + " Grade: S");
       }else if(marks>=80 && marks<=90) {
        System.out.println(  marks + " Grade: A");
    }else if(marks >=70 && marks<=80){
        System.out.println(  marks + " Grade: B");
    }else if(marks >= 60 && marks<=70){
        System.out.println(  marks + " Grade: C");
    }else if(marks >=50 && marks<= 60){
        System.out.println(  marks + " Grade: D");
    }else if(marks >= 40 && marks <= 50){
        System.out.println(  marks + " Grade: E");
    }else{
        System.out.println(  marks + " Fail");
    }
}
}

