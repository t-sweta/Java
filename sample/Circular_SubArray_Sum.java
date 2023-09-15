package sample;
// import java.util.*;
import java.lang.Math;
import java.util.*b;
public class Circular_SubArray_Sum {
  public static void main(String[] args) {
  //  Scanner sc = new Scanner(System.in);
    int [] arr = {1,2,-3,-2,6};
    int sum = 0;
    int n = arr.length;
    int ans = Integer.MIN_VALUE;
    for(int i = 0;i<n;i++){
      
      sum+=arr[i];
      ans=Math.max(ans,sum);
      if(sum<0){
        sum = 0;
      }
      i=i%n;

    }
    System.out.print(ans);
  }
}
