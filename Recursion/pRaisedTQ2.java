
import java.util.*;
public class pRaisedTQ2 {
  public static int pow(int p,int q){
    if(q==0) return 1;
    int smallPow = pow(p,q/2);
    if(q%2==0){
      //even
      return smallPow*smallPow;
    }
    else{
      return p * smallPow * smallPow;
    }

  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int p = sc.nextInt();
    int q = sc.nextInt();
    System.out.println(pow(p,q));
    
  }
}
