import java.util.*;
public class QB63RightRotation {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.next();
    int len = str.length();
    int n = sc.nextInt();
    char[] brr = rotate(str,0,n-1);
     brr = rotate(str,n,len-1);
     brr = rotate(str,0,len-1);
     for(int i = 0;i<brr.length;i++){
      System.out.print(brr[i]);
     }


  }
  public static char[] rotate(String str,int s,int e){
    char[] arr = str.toCharArray();
    while(s<e){
      char temp = arr[s];
      arr[s]=arr[e];
      arr[e]=temp;
      s++;
      e--;

    }
    // for(int i = s;i<=e;i++){
    //   System.out.print(arr[i]);
    // }
    return arr;
    
  }
  
}
