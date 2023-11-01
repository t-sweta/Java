import java.util.*;
public class reverseArray {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for(int i = 0;i<n;i++){
      arr[i]=sc.nextInt();
    }
    // reverse(arr,0,n-1);      -->needs 2 pointers
    // below is a more optimized code as u dont need 2 pointes for this ,can be doe in one pointer also
    reverse2(arr,0);
    for(int i = 0;i<n;i++){
      System.out.print(arr[i]+" ");
    }
  }
  private static void swap(int[] arr,int s,int e){
    int temp = arr[s];
    arr[s]=arr[e];
    arr[e]=temp;
  }
  public static void reverse2(int[] arr,int ind){
    int n = arr.length;
    if(ind>=n/2) return;
    swap(arr,ind,n-ind-1);
    reverse2(arr,ind+1);
  }
  public static void reverse(int[] arr,int s,int e){
    if(s>=e) return;
    swap(arr,s,e);
    reverse(arr,s+1,e-1);


  }
  
}
