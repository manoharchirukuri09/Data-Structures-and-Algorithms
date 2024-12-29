public class Sum_of_Second_row {
    public static void main(String[] args) {
        int matrix[][]={{1,4,9},
                       {11,4,3},
                      {2,2,3}};
        int n=matrix.length;
        int m = matrix[0].length;
        int sum=0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(i==1){
                    sum +=matrix[i][j];
                }
            }
            }
            System.out.println("Sum of second row is "+sum);
        int sum = 0;
        for( int j=0;j<m;j++){
            sum +=matrix[1][j];
        }
        System.out.println("Sum of second row is "+sum);
}
    }


