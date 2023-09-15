package Classroom;

import java.util.*;

public class srockSPanSir {
  public static void main(String[] args) {
    int arr[] = { 30, 35, 80, 38, 35 };
    Stack<Integer> st = new Stack<>();
    int[] ans = new int
    [arr.length];
    for (int i = 0; i < arr.length; i++) {
      while (!st.isEmpty() && arr[i] > arr[st.peek()]) {
        st.pop();
      }
      if (st.isEmpty()) {
        ans[i] = i + 1;
      } else {
        ans[i] = i - st.peek();
      }
      st.push(i);
    }
    System.out.println(Arrays.toString(ans));
  }

}
