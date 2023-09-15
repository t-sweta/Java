package Classroom;
import java.util.*;
public class celebritySir {
  public static void main(String[] args) {
    int [][] arr = {{0,1,1,1},{1,0,1,1},{0,0,1,0},{1,1,1,0}};
    Stack<Integer> st = new Stack<>();
    for(int i =0;i<arr.length;i++){
      st.push(i);
    }
    while(st.size()!=1){
      int a = st.pop();
      int b = st.pop();
      if(arr[a][b]==1){
        st.push(b);
      }
      else{
        st.push(a);
      }
    }
    System.out.println(st);
    //ye celebrity ban skata hai [2]
    boolean flag = false;
    int ans = st.pop();
    //int ans = st.pop();
    for(int i = 0;i<arr.length;i++){
      if(i!=ans && (arr[ans][i])==1 || arr[i][ans]==0){
        flag = true;
        break;
      }
    }
    if(flag){
      System.out.println(-1);
    }
    else{
      System.out.println(ans);
    }

  }
  
}
