import java.util.*;
public class countDistinctString {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    int res = noDuplicte(s);
    System.out.println(res);

  }
  private static int noDuplicte(String s){
    int[] arr = new int[26];
    int j = 0;
    String st = s.toLowerCase();

    while(j<st.length()){
      int ch = st.charAt(j)-'a';
      arr[ch]++;
      j++;
    }
    int count = 0;
    for(int i = 0;i<26;i++){
      if(arr[i]>0){
        count++;
      }
    }
    return count;
  }

  
}
