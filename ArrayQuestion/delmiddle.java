package ArrayQuestion;
import java.util.*;
public class delmiddle {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int [] arr= new int[n];
    for(int i =0;i<n;i++){
      arr[i]=sc.nextInt();

    }
    int mid = -1;
    if(n%2==0){
       mid = n/2;
    }else{
      mid=n/2+1;
    }
    for(int i = mid;i<n;i++){
      arr[i-1]=arr[i];
    }
    System.out.println(Arrays.toString(arr));

  }
  
}
