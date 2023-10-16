package kunalRecursion;
import java.util.*;

public class palindrome {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    System.out.println(palin(n));
    
  }
  static int  rev(int n){
  int digits = (int)(Math.log10(n))+1;
  return helper(n,digits);
  
  }
  private static int helper(int n,int digits){
    if(n%10==n) return n;
    int rem = n%10;
    return rem*(int)Math.pow(10,digits-1)+helper(n/10,digits-1);
  }
  static boolean palin(int n){
    if(n==rev(n)) return true;
    return false;
  }

  


  
}
