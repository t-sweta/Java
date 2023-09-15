package linkList;

public class linkedList_Implementation {
  public static class Node {
    int data;
    Node next;

    public Node(int data) {
      this.data = data;
    }
  }

  public static class linkedlist {
    Node head = null;// here head gets updated every time a function is called
    Node tail = null;

    void insertAtEnd(int val) { // public static nhi lagaa rhe since class mein already mentioned hai
      Node temp = new Node(val);
      if (head == null) {
        head = temp;
        // tail = temp;
      } else {
        tail.next = temp;
        // tail=temp; its comming two times in if and in else also hence
      }
      tail = temp;
    }

    void insertAtHead(int val) {
      Node temp = new Node(val);
      if (head == null) {
        head = tail = temp;// or insertAtEnd(val);
        // head=temp &tail=temp;

      } else {
        temp.next = head;
        head = temp;

      }
    }

    void insertAt(int idx, int val) {
      Node t = new Node(val);
      Node temp = head;
      if (idx == size()) {
        insertAtEnd(val);
        return;
      } else if (idx == 0) {
        insertAtHead(val);
        return;

      } else if (idx < 0 || idx > size()) {
        System.out.println("wrong index");
        return;
      }
      for (int i = 1; i <= idx - 1; i++) {
        temp = temp.next;
      }
      t.next = temp.next;
      temp.next = t;
    }

    int size() {
      Node temp = head;
      int count = 0;
      while (temp != null) {
        count++;
        temp = temp.next;
      }
      return count;
    }
    int getAt(int idx){
      if(idx<0 || idx>size()){
        System.out.println("wrong idx");
        return -1;
      }
      Node temp = head;
      for(int i =1;i<=idx;i++){
        temp=temp.next;
      }
      return temp.data;
    }

    void display() {
      Node temp = head; // node head points to temp
      while (temp != null) {
        System.out.print(temp.data + " ");
        temp = temp.next;
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    linkedlist ll = new linkedlist();
    ll.insertAtEnd(5);
    ll.insertAtHead(6);
    ll.display();
    ll.insertAtEnd(8);
    ll.insertAtEnd(10);
    ll.insertAtHead(-1);
    ll.display();
    ll.insertAt(0, 50);
    ll.display();
    ll.insertAt(7, 77);
    ll.display();
    ll.insertAt(4, 69);
    ll.display();
    System.out.println(ll.getAt(4));
    System.out.println(ll.getAt(0));

  }

}
