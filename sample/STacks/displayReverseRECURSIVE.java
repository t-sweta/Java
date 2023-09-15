package STacks;

import java.util.*;

public class displayReverseRECURSIVE {
  public static void displayRevRec(Stack<Integer> st) {
    if(st.size()==0){  //Base Case
      return ;
    }
    int top = st.pop();
    System.out.print(top+" ");
    displayRevRec(st);
    st.push(top);

  }

  public static void main(String[] args) {
    Stack<Integer> st = new Stack<>();
    st.push(1);
    st.push(2);
    st.push(3);
    st.push(4);
    st.push(5);
    displayRevRec(st);
  }

}
