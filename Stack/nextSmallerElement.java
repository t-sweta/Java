import java.util.*;
public class nextSmallerElement {
  public static void main(String[] args){
    int [] arr = {1,4,3,7,8,2,6};
    int [] res = nextSmaller(arr);
    for(int i = 0;i<arr.length;i++){
    System.out.print(res[i]+" ");
    }
  }
  public static int[] nextSmaller(int[] arr){
    int[] ans = new int[arr.length];
    Stack<Integer>st = new Stack<>();
    Arrays.fill(ans,-1);
    for(int i = arr.length-1;i>=0;i--){
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
