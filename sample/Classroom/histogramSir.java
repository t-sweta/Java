package Classroom;

import java.util.Stack;

public class histogramSir {
  public static void main(String[] args) {

    int[] arr = { 10, 40, 30, 70, 10, 30, 60 };
    int area = 0;
    Stack<Integer> st = new Stack<>();
    for (int i = 0; i < arr.length; i++) {
      while (!st.isEmpty() && arr[i] < arr[st.peek()]) {
        int rm = i;
        int height = arr[st.pop()];
        // int lm = st.peek();
        // int a = (rm - lm -1)*height;
        if (st.isEmpty()) {
          int a = rm * height;
          area = Math.max(area, a);

        } else {
          int lm = st.peek();
          int a = (rm - lm - 1) * height;
          area = Math.max(area, a);
        }
      }
      st.push(i);

    }
    while (!st.isEmpty()) {
      int rm = arr.length;
      int height = arr[st.pop()];
      // int lm = st.peek();
      // int a = (rm - lm -1)*height;
      if (st.isEmpty()) {
        int a = rm * height;
        area = Math.max(area, a);

      } else {
        int lm = st.peek();
        int a = (rm - lm - 1) * height;
        area = Math.max(area, a);
      }
    }
    System.out.println(area);

  }

}
