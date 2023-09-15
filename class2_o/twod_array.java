import java.util.*;

public class twod_array {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[][] arr = new int[5][];
    int[] arr2 = new int[5];
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr2.length; j++) {
        arr2[j] = sc.nextInt();
      }
      arr[i] = arr2;
    }
  }
}

  /*
   * Scanner sc = new Scanner(System.in);
   * int [][] arr= new int[2][3];
   * for(int i = 0;i<2;i++){
   * for(int j =0;j<3;j++){
   * arr[i][j]=sc.nextInt();
   * 
   * }
   * }
   * for(int j =0;j<2;j++){
   * for(int i =0;i<3;i++){
   * 
   * }
   * }
   * //arr.length
   * //arr[i].length--
   */
  /*
   * //jagged array
   * Scanner sc = new Scanner(System.in);
   * int arr[][] = new int[5][];
   * for(int i =0;i<5;i++){
   * int brr[][] = new int[5][n];
   * int n = sc.nextInt();
   * for(int j =0;j<n;j++){
   * arr[i][j]=sc.nextInt();
   * }
   * 
   * }
   * 
   */

// arr.length
// arr[i].length--