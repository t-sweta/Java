package kunalRecursion;
import java.util.*;

public class priintN {
  // print from n to 1
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
   int n = sc.nextInt();
   print(n);
    
  }
  static void print(int n){
    if(n==1){
      System.out.println(n);
      return;
    }
    System.out.println(n);
    print(n-1);
  }
  

  
}
