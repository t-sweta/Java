import java.util.*;
public class printNNo{
  public static void printIncreasing(int n){
    //base case
    if(n==1){
      System.out.println(n);
      return;
    }
    //assumption
    printIncreasing(n-1);  //1 2 3 ......n-1 
    //self work
    System.out.println(n);;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    printIncreasing(n);
    
  }
}