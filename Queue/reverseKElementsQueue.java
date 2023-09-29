import java.util.*;
public class reverseKElementsQueue {
  public static void main(String[] args) {
    Queue<Integer> q = new LinkedList<>();
    Stack<Integer> st = new Stack<>();
    q.add(1);
    q.add(2);
    q.add(3);
    q.add(4);
    q.add(5);
    q.add(6);
    System.out.println(q);
    int k = 4;
    for(int i = 0;i<k;i++){
      st.push(q.remove());
    }
    while(st.size()>0){
      q.add(st.pop());
    }
    for(int i = 0;i<q.size()-k;i++){
      int a = q.remove();
      q.add(a);
    }
    System.out.println(q);



  }
  
}
