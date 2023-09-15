package STacks;

import java.util.*;

public class basicsOfStacks {
  public static void main(String[] args) {
    Stack<Integer> st = new Stack<>();
    System.out.println(st.isEmpty());   //true
    System.out.println("size of stack is:" + st.size());
    System.out.println(st);
    st.push(6);
    System.out.println(st.isEmpty());   //false but generally we dont use this as we use st.size() more
    st.push(23);
    st.push(90);
    st.push(5);
    st.push(34);
    // peak
    System.out.println(st.peek());
    System.out.println(st);
    st.pop();
    System.out.println(st);
    //Q print first element of the stack
    while(st.size()>1){
      st.pop();
    }
    System.out.println(st.peek());
    //Ab HAMARA STAVK URR CHUKA HAI
    //WAAPIS PRINT KARNE PE NHI KAREGA POPPPED ELEMENTS KO
    //this is the PROBLEM OF STACK
    //size of stack keeps changing when we keep pushing and popping elements in the stack

    System.out.println(st);


  }

}
