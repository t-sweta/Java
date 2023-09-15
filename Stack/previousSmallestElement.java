import java.util.*;
public class previousSmallestElement {
  public static void main(String[] args){
    int [] arr = {1,4,3,7,8,2,6};
    int [] res = nextGreaterLeft(arr);
    for(int i = 0;i<arr.length;i++){
      System.out.print(res[i]+" ");
    }



  }
  public static int[] nextGreaterLeft(int[] arr){
    int[] ans = new int[arr.length];
    Arrays.fill(ans,-1);
    Stack<Integer> st = new Stack<>();
    for(int i = 0;i<arr.length;i++){
      while(!st.empty() && st.peek()>arr[i]){
        st.pop();
      }
      if(!st.empty() && st.peek()<arr[i]){
        ans[i]=st.peek();
      }
      st.push(arr[i]);

    }
    return ans;
  }
  
}
