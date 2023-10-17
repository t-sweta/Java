import java.util.*;

public class ET1StringCompression {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    // System.out.println(compress(s)); USING METHOD 1
    System.out.println(compression(s));
  }

  private static String compress(String s) {
    // METHOD 1 (WITHOUT USING HASHMAP)
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

  private static String compression(String s) {
    // USING HASHMAP(linkedhashmap as it maintains the order as it is)
    StringBuilder sb = new StringBuilder();

    LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();

    for (int i = 0; i < s.length(); i++) {

      char ch = s.charAt(i);
      if (map.containsKey(ch)) {
        int count = map.get(ch);
        count++;
        map.put(ch, count);

      } else {
        map.put(ch, 1);
      }
    }
    for (Map.Entry<Character, Integer> e : map.entrySet()) {
      sb.append(e.getKey());
      sb.append(e.getValue());

    }
    return sb.toString();

  }

}
