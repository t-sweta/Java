import java.util.*;
public class QB9RecurssiveTextSearch {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    String target = sc.nextLine();
    ArrayList<Integer> a = new ArrayList<>();
    for(int i = 0;i<str.length();i++){
      for(int j = i;j<str.length();j++){
        String s = str.substring(i,j+1);
        if(s.equals(target)){
          a.add(i);
        }
      }
    }
    if(a.isEmpty()) System.out.println(-1);
    else{
      System.out.println(a);
    }
  }
  
}
