package STacks;

import java.util.*;

public class RecReverseStack {
  public static void pushAtBottom(Stack<Integer> st, int x) {
    if (st.size() == 0) {
      st.push(x);
      return;
    }
    int top = st.pop();
    pushAtBottom(st, x);
    st.push(top);

  }

  public static void RecRevSt(Stack<Integer> st) {
    if (st.size() == 1)
      return;// since single emlemnts reverse is the same no.
    int top = st.pop();
    RecRevSt(st); // recurion apneaap krlega reverse
    pushAtBottom(st, top); // ab top elemnt jise pop karwaya tha use reversed elemnt k bottom mein daaldo
  }

  public static void main(String[] args) {
    Stack<Integer> st = new Stack<>();
    st.push(1);
    st.push(2);
    st.push(3);
    st.push(4);
    st.push(5);
    System.out.println(st);
    RecRevSt(st);
    System.out.println(st);

  }

}
