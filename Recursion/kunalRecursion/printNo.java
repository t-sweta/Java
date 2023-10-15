package kunalRecursion;
import java.util.*;

public class printNo {
  public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    // int n = sc.nextInt();
    print(1);
    
  }
  private static void print(int n){
    if(n==5){
      System.out.println(n);
      return;
    }
    System.out.println(n);
    print(n+1) ;
  }
  
}
