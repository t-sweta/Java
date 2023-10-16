package kunalRecursion;
import java.util.*;

public class productOfDigits {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    System.out.println(productOfDig(n));
  }
  static int productOfDig(int n){
    if(n==0) return 1;
    int l = n%10 ;
    return productOfDig(n/10)*l;
  }
  
}
