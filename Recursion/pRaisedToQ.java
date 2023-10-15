import java.util.*;
public class pRaisedToQ {
  public static int power(int p,int q){
   if(q==0) return 1;
   if(q==1) return p;
   return p*power(p,q-1) ;

  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
  int p = sc.nextInt();
  int q = sc.nextInt();
  System.out.println(power(p,q));
    
  }
  
  
}
