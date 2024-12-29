public class Transpose_matrix {
    public static void transpose(int arr[][]){
        int n = arr.length;
        int m = arr[0].length;
        int[][] transpose = new int[m][n];
        for(int i=0;i<n;i++){ 
            for(int j=0;j<m;j++){ 
                transpose[i][j]=arr[j][i];
            }
        }
        //output transpose
        for(int i=0;i<m;i++){ 
            for(int j=0;j<n;j++){
                System.out.print(transpose[i][j] + " ");
        }
        System.out.println();
    }
}
public static void main(String[] args) {
    int arr[][] = {{1,2,3},
                   {4,5,6},
                   {7,8,9}};
                   System.out.println("Original Matrix:");
                   for(int i=0;i<arr.length;i++){
                    for(int j=0;j<arr[0].length;j++){
                        System.out.print(arr[i][j] + " ");
                    }
                    System.out.println();
                   }
                   transpose(arr);
        
}
}

