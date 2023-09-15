
// package Stack;
import java.util.*;

public class nextGreaterElementRight {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] arr = { 1, 4, 3, 7, 8, 2, 6 };
    int[] res = nextGreaterRight(arr);
    for (int i = 0; i < arr.length; i++) {
      System.out.print(res[i] + " ");
    }

  }

  public static int[] nextGreaterRight(int[] arr) {
    int[] ans = new int[arr.length];
    Arrays.fill(ans, -1);
    Stack<Integer> st = new Stack<>();
    for (int i = arr.length - 1; i >= 0; i--) {
      while (!st.empty() && st.peek() < arr[i]) {
        st.pop();
      }
      if (!st.empty() && st.peek() > arr[i]) {
        ans[i] = st.peek();
      }
      st.push(arr[i]);
    }
    return ans;

  }

}