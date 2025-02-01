public class Number_to_word {
    public static void Word(int n, String arr[]){
        if(n==0){
            return;
        }
        int ld = n%10;
        Word(n/10, arr);
        System.out.print(arr[ld-1] + " ");
    }
    public static void main(String[] args){
        String arr[] = {"one", "two", "three", "four", "five", "six" , "seven" , "eight" , "nine"};
        Word(123, arr);
    }
    }

