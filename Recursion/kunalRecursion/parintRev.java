package kunalRecursion;
import java.util.*;

import java.util.Scanner;

public class parintRev {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
   int n = sc.nextInt();
   print(n);
   System.out.println();
   System.out.println();
   System.out.println();
   System.out.println();
   printRev(n);
   
    
  }
  static void print(int n){
    // this function will print both of them from top to bottom and from bottom to top
    if(n==0){
      // System.out.println(n);
      return;
    }
    
    System.out.println(n);
    print(n-1);
    System.out.println(n);
  }
  static void printRev(int n){
    if(n==1){
      System.out.println(n);
      return ;
    }
    printRev(n-1);
    System.out.println(n);
  }
  
}
