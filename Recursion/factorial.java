import java.util.*;
public class factorial {
  public static int fact(int n){
    if(n==0){
      return 1;
    }
    return fact(n-1)*n;
  
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int ans = fact(n);
    System.out.println(ans);

  }
  
}
