import java.util.HashSet;
import java.util.TreeSet;

public class Set_Demo {
  public static void main(String[] args) {
    // HashSet<Integer>set = new HashSet<>();
    // set.add(10);
    // set.add(10);//cannto take duplicates in it
    // set.add(20);
    // set.add(20);
    // System.out.println(set);

    TreeSet<Integer> set = new TreeSet<>();
    set.add(10);
    set.add(10);// cannto take duplicates in it
    set.add(20);
    set.add(20);
    System.out.println(set);
  }

}
