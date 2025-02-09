public class RatInMaze {
    public static void Maze(int x, int y, int mat[][] , int n, String curr){
        if(x<0 || y<0 || x==n || y==n || mat[x][y]==0 ){
            return;
        }
        if(x==n-1 && y==n-1){
        System.out.println(curr);
        }
        mat[x][y] =0;
        // rat move towards down
        Maze(x+1,y,mat,n, curr+"D");
        // rat move towards right
        Maze(x, y+1,mat,n,curr+"R");
        //rat move towards left
        Maze(x,y-1,mat,n,curr+"L");
        //rat move towards up
        Maze(x-1,y,mat,n,curr+"u");
         mat[x][y]=1;

    }
    public static void main(String[] args){
    int n = 4;
    int mat[][] = new int[n][n];
     mat[0][0] = 1;
     mat[0][1]=0;
     mat[0][2]=0;
     mat[0][3]=0;
     mat[1][0]=1;
     mat[1][1]=1;
     mat[1][2]=0;
     mat[1][3]=0;
     mat[2][0]=0;
     mat[2][1]=1;
     mat[2][2]=1;
     mat[2][3]=0;
     mat[3][0]=0;
     mat[3][1]=1;
     mat[3][2]=1;
     mat[3][3]=1;
     Maze(0,0,mat,n,"");

    }
}
