package linkedlist2;
import java.util.*;
public class llToArray {
  public static void main(String[] args) {
     LinkedList<Integer> list = new LinkedList<>();
     list.add(123);
     list.add(12);
     list.add(44);
     list.add(1134);
     System.out.println("linkedlist: "+list);
     Object[] a = list.toArray();
     System.out.print("ll converted to aray");
     for(Object element : a){
      System.out.print(element+" ");

     }

  }
  
}
