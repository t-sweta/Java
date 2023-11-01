import java.util.*;
public class palindromeStrings{
  public static boolean palindrome(int ind,String s){
    int n = s.length();
    if(ind>=n/2) return true;
    if(s.charAt(ind)!=s.charAt(n-ind-1)) return false;
    return palindrome(ind+1,s);

  }
  public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    String s = sc.next();
    // int[] arr = new int[n];
    // for(int i= 0;i<n;i++){
    //   arr[i]=sc.nextInt();
    // }
    System.out.println(palindrome(0,s));


  }

}