package Classroom;

public class linkedList_client {
  public static void main(String[] args) {
    linkedlList ll = new linkedlList();
    ll.addFirst(10);
    ll.addFirst(20);
    ll.addFirst(30);
    ll.addFirst(40);
    ll.addFirst(50);
    ll.addLast(70);
    ll.addLast(90);
    ll.display();
    System.out.println();
    System.out.println(ll.tail);
  }

}
