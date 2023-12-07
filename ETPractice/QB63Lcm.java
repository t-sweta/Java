import java.util.*;
public class QB63Lcm {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    System.out.println(lcm(n,m));
  }
  public static int gcd(int n,int m){
    if(m==0){
      return n;
    }
    return gcd(m,n%m);
  }
  public static int lcm(int n , int m){
    return (n*m)/gcd(n,m);
  }
  
  
}
