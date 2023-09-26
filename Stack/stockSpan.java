import java.util.*;

public class stockSpan {
  public static void main(String[] args) {
    int[] arr = { 100, 80, 60, 70, 60, 75, 85 };
    int[] res = stockSpans(arr);
    for (int i = 0; i < arr.length; i++) {
      System.out.print(res[i] + " ");
    }
  }

  public static int[] stockSpans(int[] arr) {
    Stack<Integer> st = new Stack<>();
    int n = arr.length;
    int[] ans = new int[arr.length];
    Arrays.fill(ans, 1);
    for (int i = 0; i < n; i++) {
      while (!st.empty() && arr[st.peek()] < arr[i]) {
        st.pop();
      }
      if (!st.empty() && arr[st.peek()] > arr[i]) {
        ans[i] = i - st.peek();
      }
      st.push(i);
    }
    return ans;

  }

}
