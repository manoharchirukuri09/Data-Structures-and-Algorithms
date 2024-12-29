public class String_Compare {
    public static void main(String[] args){
        String s1 = "manu";
        String s2 = "manu";
        String s3 = new String("manu");
        // == compare memory location
        if(s1==s2){
            System.out.println("s1 and s2 are same");
        }else{
            System.out.println("s1 and s2 are not same");
        }
    
        // .equals() compare content characters
        if(s1.equals(s3)){
            System.out.println("s1 and s3 are same");
    }else{
        System.out.println("s1 and s3 are not same");
    }
}
}
