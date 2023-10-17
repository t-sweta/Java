import java.util.*;

public class ET1StringCompression {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    System.out.println(compress(s));

  }

  private static String compress(String s) {
    int n = s.length();
    String ans = "";
    int j = 1;
    int count = 1;
    int i = 0;
    while (j < n) {
      if (s.charAt(i) != s.charAt(j)) {
        ans = ans + s.charAt(i) + count;
        count = 1;
        i = j;
        j++;

      } else {
        j++;
        count++;
      }
    }
    ans = ans + s.charAt(i) + count;

    return ans;
  }

}
