public class NthNodeFromEnd {
  public static Node nthNode(Node head, int n) {  //this function returns node hence node is taken as return type
    int size = 0;
    Node temp = head;
    while (temp != null) {
      size++;
      temp = temp.next;
    }
    int m = size - n + 1;
    temp = head;
    for (int i = 1; i <= m - 1; i++) {
      temp = temp.next;
    }
    return temp;
  }
  public static Node nthNode2(Node head,int n){  //SLOW AND FAST POINTER (OPTIMUM APPROACH IN SINGLE TRAVERSAL)
    Node slow = head;  //pointers
    Node fast=head;
    for(int i = 1;i<=n;i++){
      fast=fast.next;
    }
    while(fast!=null){
      slow=slow.next;
      fast=fast.next;
    }
    return slow;
  }

  public static class Node {
    int data;
    Node next;

    Node(int data) {
      this.data = data;
    }
  }

  public static void main(String[] args) {
    Node a = new Node(5);
    Node b = new Node(6);
    Node c = new Node(7);
    Node d = new Node(8);
    
    a.next = b;
   
    b.next = c;
    c.next = d;
    //Node temp = nthNode(a, 2);
    //System.out.println(temp.data);   used with brute force appoach
    Node temp = nthNode2(a, 2);
    System.out.println(temp.data);
  }

}
