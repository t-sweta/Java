package kunalRecursion;
import java.util.*;

public class sumNto1 {
  public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     System.out.println(sum(n));
    
  }
  static int sum(int n ){
    if(n<=1) return 1;
    return n + sum(n-1);
  }
 
  
  
}
