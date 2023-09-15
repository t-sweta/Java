package STacks;

import java.util.*;

public class RemoveAtInd {
  public static void removeInd(Stack<Integer> st, int ind) {
    Stack<Integer> rt = new Stack<>();
    while (st.size() > ind+1) {
      rt.push(st.pop());
    }
    st.pop();
    while (rt.size() > 0) {
      st.push(rt.pop());
    }
  }

  public static void main(String[] args) {
    Stack<Integer> st = new Stack<>();
    st.push(1);
    st.push(3);
    st.push(4);
    st.push(5);
    System.out.println(st);
    removeInd(st, 2);
    System.out.println(st);
  }

}
