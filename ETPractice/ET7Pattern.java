import java.util.*;
public class ET7Pattern {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String[] s = new String[n];
    for(int i = 0;i<n;i++){
       s[i] = sc.next();
    }
    pattern(s);
  }
  private static void pattern(String[] s){
    // int count = 0;
    for(String e : s){
      if(e.charAt(0)=='I'){
        int n = 1;
        System.out.print(n);
        int len = e.length();
        for(int i = 0;i<len;i++){
          n++;
          System.out.print(n);
        }
        System.out.println();
        // return;

      }
      // if(e.charAt(0)=='D'){
      //   count++;
      // }
      else{
        int len = e.length();
        int n = len+1;
        System.out.print(n);
        for(int i = 0;i<len;i++){
          n--;
          System.out.print(n);
        }
        System.out.println();
        // return;
      }
    }
    return;

  }
  
}
