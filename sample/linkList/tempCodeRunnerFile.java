public static Node removenth(Node head, int n) {
    Node slow = head;
    Node fast = head;
    for (int i = 1; i <= n; i++) {
      fast = fast.next;
    }
    if (fast == null) {
      head = head.next;
      return head;
    }
    while (fast.next != null) {
      slow = slow.next;
      fast = fast.next;
    }
    slow.next = slow.next.next;
    return head;
  }

  public static void display(Node head) {
    Node temp = head;
    while (temp != null) {
      System.out.print(temp.data + " ");
      temp = temp.next;
    }
    System.out.println();
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

    display(a);
    a = removenth(a, 2);
    display(a);
  }