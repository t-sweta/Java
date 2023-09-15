package STacks;

import java.util.*;

public class DisplayStack {
  public static void main(String[] args) {
    Stack<Integer> st = new Stack<>();
    st.push(1);
    st.push(2);
    st.push(3);
    st.push(4);
    System.out.println(st);
    int n = st.size();// size of the stack keeps decreasing or increasing hence better to store
                      // somewhere
    int[] arr = new int[n];
    for (int i = n - 1; i >= 0; i--) {
      arr[i] = st.pop();
    }
    for (int i = 0; i < n; i++) {
      System.out.print(arr[i] + " ");
      st.push(arr[i]);
    }
    System.out.println();
    System.out.println(st); // and now we have already printed the elements and the stack is also the same
  }

}
