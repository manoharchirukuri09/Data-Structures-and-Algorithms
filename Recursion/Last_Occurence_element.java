public class Last_Occurence_element {
    public static int getLastOccurence(int arr[],int key,  int i){
        if(i >= arr.length){
            return -1;
        }
        int isfound = getLastOccurence(arr, key, i+1);
        if(isfound == -1 && arr[i]==key){ 
            return i;
        }
        return isfound;
    }
    public static void main(String[] args){
        int arr[] = {1, 2, 3, 4, 5,3,5};
        System.out.println("LastOccurence is " + getLastOccurence(arr, 5, 0));
    }
}
