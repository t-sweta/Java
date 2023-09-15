package STacks;
import java.util.*;
public class ArrayImplementation {
public static class Stack{
  private int [] arr = new int[5];
  private int idx = 0;
  void push(int x){
    if(isFull()){
      System.out.println("stack is fulll");
      return;
    }
    arr[idx] = x;
    idx++;
  }
  int peek(){
    if(idx==0){
      System.out.println("Stack is empty");
      return -1;
    }
    return arr[idx-1];
  }
  //pop does two work it deletes as well as returns the top value also
  int pop(){
    if(idx==0){
      System.out.println("Stack is empty");
      return -1;
    }
    int top = arr[idx-1];
    arr[idx-1]=0;
    idx--;
    return top;
  }
  void display(){
    for(int i = 0;i<=idx-1;i++){
      System.out.print(arr[i]+" ");
    }
    System.out.println();
  }
  int size(){
    return idx;
  }
  boolean isEmpty(){
    if(size()==0){  // OR if(idx==0){
      return true;
    }
    else return false;
  }
  int capacity(){
    return arr.length;  
  }
  boolean isFull(){
    if(idx==arr.length){
      return true;
    }
    else return false;
  }

}
  public static void main(String[] args) {
    Stack st = new Stack();
    st.push(1);
    st.push(4);
    st.push(5);
    st.push(3);
    st.display();
    System.out.println(st.size());
    st.pop();
    st.display();
    System.out.println(st.isFull());
    System.out.println(st.isEmpty());
    st.pop();
    st.pop();
    st.pop();
    System.out.println(st.isEmpty());

  }
  
}
