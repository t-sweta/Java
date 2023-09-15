package STacks;

import java.util.*;

public class insertionInStack {
  public static void main(String[] args) {
    Stack<Integer> st = new Stack<>();
    st.push(1);
    st.push(2);
    st.push(3);
    st.push(4);
    st.push(5);
    //int idx = 2;
    //int x = 9;
    int idx = 7;   //it can add element on the index which is not present like here 7th index is not present and this stacks endss at 4rth index
    int x = 50;
    Stack<Integer> temp = new Stack<>();
    while (st.size() > idx) {
      temp.push(st.pop());


    }
    st.push(x);
    while(temp.size()>0){
      st.push(temp.pop());

    }
    System.out.println(st);//[1, 2, 3, 4, 5, 50] 
  }

}
