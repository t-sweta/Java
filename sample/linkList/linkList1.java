package linkList;

import java.util.*;

public class linkList1 {
  public static class Node {
    int data;
    Node next;

    public Node(int data) {
      this.data = data;
    }
  }

  public static void display(Node head) {
    Node temp = head;
    while (temp != null) {
      System.out.print(temp.data + " ");
      temp = temp.next;
    }
  }

  public static void main(String[] args) {
    Node a = new Node(5);
    Node b = new Node(6);
    Node c = new Node(7);
    Node d = new Node(8);
    System.out.println(a.next);
    a.next = b;
    System.out.println(a.next.data);
    b.next = c;
    c.next = d;
    display(a);
  }
}
