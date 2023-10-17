
import java.util.*;
public class pdfRendition2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    try{
      String s = sc.next();
      int vowels =  countVowels(s);
      System.out.println(vowels);

    }
    catch(Exception e){
      System.out.println("Error:"+e.getMessage());

    }

    
    
  }
  private static int countVowels(String s){
      int count = 0;
      for(int i = 0;i<s.length();i++){
        char c = Character.toLowerCase(s.charAt(i));
        if(c=='a'|| c=='e'|| c=='i' || c=='o' || c=='u'){
          count++;
        }
       

      }
       return count;
    }
  
}
