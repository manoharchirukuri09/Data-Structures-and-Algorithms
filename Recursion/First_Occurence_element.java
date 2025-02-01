public class First_Occurence_element {
    public static int firstOccurence(int arr[], int i, int key){
        if(i>=arr.length){
            return -1;
        } 
        if(arr[i] == key){
            return i;
        }
        return firstOccurence(arr, i+1, key);
    }
    public static void main(String[] args){
        int arr[] ={2,3,4,3,5,6,7};
         int c= firstOccurence(arr, 0, 3);
         System.out.println(c);
    }
}
    
   
