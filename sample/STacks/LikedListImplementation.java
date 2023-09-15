package STacks;

import Classroom.stockSpan;

public class LikedListImplementation {
  public static class Node { // user defined datatype
    int val;
    Node next;

    Node(int val) {
      this.val = val;
    }
  }

  public static class LLStack { // user defined data structure
    private Node head = null;
    private int size = 0; // kyuki hum isko baahar nhi karna chahte access

    void push(int x) {// we are not writing public static sice the parent class has thisthing written
                      // in it
      Node temp = new Node(x);
      temp.next = head;
      head = temp;
      size++;

    }// NOW WE WILL TRY TO DISPLAY IN NON REVRSEE MANNER i.e NORMALLY
     // using recursion

    void displayrec(Node h) {
      if (h == null) {
        return;
      }
      displayrec(h.next);
      System.out.print(h.val + " ");

    }

    void display() {
      displayrec(head);// is function ko bhi banaaana para kyuki hum display recurion se karenge t
                       // usmeinnhead pass karenge to vo baar bar paas hoga as it will repeat itseldf

      System.out.println();// or hum main se head hi paas kr skte coz client koi head nhi karega pass
                           // display karne k liye.or agr yha isi function mein head le lete to head lose
                           // ho jaata|heance ye function sirf head ko paas karega and oopr waala funtion
                           // kisi h node mein head ko collect karega
    }

    void displayRev() {
      Node temp = head;
      while (temp != null) {
        System.out.print(temp.val + " ");// it displays the linnkedlist in reverse order
        temp = temp.next;

      }
      System.out.println();

    }

    int size() {
      return size;
    }

    int pop() {
      if (head == null) {
        System.out.println("stack is empty");
        return -1;
      }
      int x = head.val;
      head = head.next;
      size--;
      return x;
    }

    int peek() {
      if (head == null) {
        System.out.println("stack is empty");
        return -1;
      }
      return head.val;

    }
    boolean isEmpty(){
      if(size()==0){
        return true;
      }
      else return false;
    }

  }

  public static void main(String[] args) {
    LLStack st = new LLStack();
    st.push(1);
    st.push(4);
    st.push(5);
    st.push(3);
    st.display();
    System.out.println(st.size());
    st.pop();
    st.display();
    // System.out.println(st.isFull()); Since linkedlists's size is unlimited
    System.out.println(st.isEmpty());
    st.pop();
    st.pop();
    st.pop();
    System.out.println(st.isEmpty());

  }

}
