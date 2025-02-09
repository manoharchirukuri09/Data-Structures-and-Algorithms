
public class Merge_Sort {
    public static void Sorting(int arr[], int si, int ei){
        if(si>= ei){
            return;
        }
        //find the mid value of the array
        int mid = si + (ei-si)/2;
        //divide the array into two parts
        //left part
        Sorting(arr, si, mid);
        //right part
        Sorting(arr, mid+1, ei);
        // after getting the individual elements in the both the parts
        //merge them in the sorted manner
        merge(arr,si,mid,ei);
    }
        public static void merge(int arr[], int si, int mid, int ei){
            //create a temporary array to store the elements of the array
            int temp[] = new int[ei-si+1];
            //left part starting from si
            int i=si;
            //right part starting from mid+1
            int j=mid+1;
            //temp array to store the sorted elements
            int k=0;
            while(i<=mid && j<=ei){
                if(arr[i]<arr[j]){
                    temp[k]=arr[i];
                    i++;
                }else{
                    temp[k]=arr[j];
                    j++;
                }
                k++;
            }
            // copy the left part elements into temp array
            while(i<=mid){
            temp[k++]=arr[i++];
        }
        //copy the right part elements into temp array
        while(j<=ei){
            temp[k++]=arr[j++];
    }
    //copy temp to original array
    for(k=0, i=si; k<temp.length; k++,i++){
        arr[i]=temp[k];
}
    }


    public static void main(String[] args) {
        int arr[] = {6,3,9,5,2,8};
        Sorting(arr, 0, arr.length-1);//print the sort array
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
    }
    System.out.println();

}
    }


