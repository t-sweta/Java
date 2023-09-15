package Classroom;
//public static class Node{

//}
public class linkedlList {
  public class Node {
    int data;
    Node next;

    public Node() {

    }

    public Node(int val) {
      this.data = val;
    }
  }

  Node head;
  int size;
  Node tail;

  public void addFirst(int val) {
    // pehle create node and then push value in it
    Node nn = new Node();// data ka bydefault value 0 rhega and addresss ka null ek node create hote hi
    nn.data = val;

    if (size == 0) {
      head = nn;
      tail = nn;
      size++;

    } else {
      nn.next = head;
      head = nn;

      size++;
    }
  }

  public void addLast(int val) {
    if (size == 0) {
      addFirst(val);
    } else {
      Node nn = new Node(val);
      tail.next = nn;
      tail = nn;
      size++;

    }
  }

  public void display() {
    Node temp = head;
    while (temp != null) {
      System.out.print(temp.data + "-->");
      temp = temp.next;
    }
  }
  public void deleteAtPosition(int k){
    if(k==0){
      deleteFirst();
    }else{
      Node temp1 = getNode(k-1);
      Node temp2 = temp1.next;
      temp1 = temp2.next;
      temp2.next = null;
      size--;
    }


  }

}


