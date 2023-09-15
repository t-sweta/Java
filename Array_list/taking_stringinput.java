package Array_list;
import java.util.*;
public class taking_stringinput {
  public static void main(String[] args) {
    ArrayList<String> l = new ArrayList<>();
    Scanner sc= new Scanner(System.in);
    for(int i =0;i<3;i++){
      String n = sc.next();
      l.add(n);

    }
    System.out.println(l);
    
  }
  
}
