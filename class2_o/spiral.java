import java.util.Scanner;

public class spiral {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int [][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
    int minrow = 0;
    int maxrow = arr.length - 1;
    int mincol = 0;
    int maxcol = arr[0].length - 1;
    int count = 0;
    int tle = arr.length*arr[0].length;
    while(count<tle){
       for(int j = mincol;j<=maxcol && count<tle;j++){
        System.out.println(arr[minrow][j]);
        count++;
      
       }
       minrow++;
       for(int i = minrow;i<=maxrow && count<tle;i++  ){
        System.out.println(arr[i][maxcol]);
        count++;
       }
       maxcol--;
       for(int j = maxcol;j>=mincol && count<tle;j--){
        System.out.println(arr[maxrow][j]);
        count++;

       }
       maxrow--;
       for(int i = maxrow;i>=minrow && count<tle;i--){
        System.out.println(arr[i][mincol]);
        count++;
       }
       mincol++;
    }
   
  
  }
  
}
