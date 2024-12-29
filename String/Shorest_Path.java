public class Shorest_Path {
   public static float isShortpath(String str) { 
    int X =0,Y=0;
    int n = str.length();
  for(int i=0;i<n;i++){
    char dir = str.charAt(i);
    //north
    if(dir =='N'){
        Y++;
    }
    //south
    else if(dir =='S'){
        Y--;
  }
  //east
  else if(dir =='E'){
    X++;
   } 
   //west
   else if(dir =='W') {
    X--;
  }
   }
int X2 = X*X;
int Y2 = Y*Y;
return (float) Math.sqrt(X2 +Y2);
}
public static void main(String[] args){
    String str = "WNEENESENNN";
    System.out.println(isShortpath(str));
}
}
