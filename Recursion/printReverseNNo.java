import java.util.*;
public class printReverseNNo {
  public static void print(int n ){
    if(n==1){
      System.out.println(n);
      return;
    }
    System.out.println(n);
    print(n-1);
    return;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    print(n);
    sc.close();


    
  }
  
}
