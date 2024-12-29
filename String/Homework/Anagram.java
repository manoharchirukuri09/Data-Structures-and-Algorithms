import java.util.Arrays;

public class Anagram {
    public static void checkAnagram(String str1, String str2) {
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        
        if (str1.length() == str2.length()) {
            char[] arr1 = str1.toCharArray();
            char[] arr2 = str2.toCharArray();
            
            Arrays.sort(arr1);
            Arrays.sort(arr2);
            
            boolean result = Arrays.equals(arr1, arr2);
            if (result) {
                System.out.println("It is an Anagram");
            } else {
                System.out.println("It is not an Anagram");
            }
        } else {
            System.out.println("It is not an Anagram");
        }
    }

    public static void main(String[] args) {
        String str1 = "LISTEN";
        String str2 = "SILENT";
        checkAnagram(str1, str2);
    }
}
