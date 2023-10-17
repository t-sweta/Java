import java.util.*;
public class rendG1 {
  //find if the two strings are permutation of each other or not
  //I M CONSIDERING ALL TYPE OF STRINGS i.e STRINGS HAVING DIFFERENT CHARACTERS.  HENCE TAKING
  //ARRAY OF  256 CHARACTERS AS FREQUENCY ARRAY
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s1 = sc.next();
    String s2 = sc.next();
    System.out.println(isPalindrome(s1,s2));



  }
  private static boolean isPalindrome(String s1,String s2){
    int[] count1 = new int[256];
    int[] count2 = new int[256];
    
    if(s1.length()!=s2.length()) return false;
    for(int i = 0;i<s1.length();i++){
      int ch = s1.charAt(i);
      int bh = s2.charAt(i);
      count1[ch]++;
      count2[bh]++;
    }
    for(int i = 0;i<256;i++){
      if(count1[i]!=count2[i]) return false;
    }
    
    return true;
  }
}
