import java.util.*;
public class displayQueue{
  public static void main(String[] args) {
    Queue<Integer> q = new ArrayDeque<>();
    q.add(10);
    q.add(2);
    q.add(3);
    q.add(4);
    q.add(5);
    Queue<Integer> helper = new ArrayDeque<>();
    while(!q.isEmpty()){
      System.out.print(q.peek()+" ");
      helper.add(q.poll());
    }
    while(!helper.isEmpty()){
      q.add(helper.poll());
    }
    System.out.println(q);
    
  }
}