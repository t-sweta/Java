package kunalRecursion;
import java.util.*;

public class reverseNo {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    reverse(n);
  }
  static void reverse(int n){
    //MY METHOD
    //METHOD 1
    if(n==0) return ;
    
    System.out.print((n%10) );
    reverse(n/10);
    // System.out.print(reverse(n/10));
    return ;
  }

  //METHOD 2
  static int sum = 0;
  static void rev1(int n){
    //by declaring global variable above and using it in the function(CHEATING WITH RECURSION)
    if(n==0){
      return;
    }
    int rem = n%10;
    sum = sum*10 + rem;
    rev1(n/10);

  }

  //METHOD 2
  static void rev2(int n){
    // sometiems u might need some additional variables in the arguement 
    // in that case, make another helper function
    
  }
}
