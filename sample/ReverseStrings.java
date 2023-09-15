public class ReverseStrings {
  public static void main(String[] args) {
    String str = "Shreya";
    int s = 0;
    int e = str.length() - 1;
    StringBuilder sb = new StringBuilder(str);// use srinf builder to modify string in java
    while (s < e) {
      char temp = sb.charAt(s);
      sb.setCharAt(s, sb.charAt(e));// using setCharAt function of setbuilder to set the chaaracters of the string
      sb.setCharAt(e, temp);
      s++;
      e--;
    }
    System.out.print(sb);
  }
}
