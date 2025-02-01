public class Uppercase_to_Lowercase {
    public static void main(String[] args) {
        for(char ch ='A'; ch<='Z';ch++){
            System.out.print((char)(ch | ' '));
        }
    }
}
