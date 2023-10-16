package kunalRecursion;
import java.util.*;

public class sumOfDigits {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    System.out.println(sumofDig(n));
  }
  static int sumofDig(int n){
    if(n==0) return 0;
    return sumofDig(n/10) + (n%10);
  }
  
}
