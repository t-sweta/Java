import java.util.*;
public class sizeMaxSumHeight {
  static int size = 0;
  public static class Node {
    int val;
    Node left;
    Node right;
    public Node(int val){
      this.val = val;
    }
  }

  public static void preorder(Node  root){
    //printing in preorder -->> 1 2 4 5 3 6
    //now in order to get the size we can do a SASTA TAREEKA->>can declare a global variable called size = 0; and then increase count evry time instead of printing the values.
    if(root==null) return;
    // System.out.println(root.val);-->1 2 4 5 3 6
    size++;
    preorder(root.left);
    preorder(root.right);
  }
  
  public static int sizee(Node root){
    if(root == null) return 0;
    return 1 + sizee(root.left) + sizee(root.right);
    
  }
  public static int maxi(Node root){
    if(root == null) return Integer.MIN_VALUE;
    return Math.max(root.val,Math.max(maxi(root.left),maxi(root.right)));
  }

  public static int height(Node root){
    
  }
  public static int sum(Node root){
    if(root==null) return 0;
    // return root.val+sum(root.left.val)+sum(root.right.val);   this is wrong->sum(root.left.val) coz here we are making recursive call to the next cild left and right node 
    //as far as value is conserned as we need to add the values only->so that value is taken from the root.val only rest we just need to make recursive call for the next node
    return root.val+sum(root.left)+sum(root.right);

  }
  public static void main(String[] args) {
    Node root =  new Node(-1);
    Node a = new Node(-2);
    Node b = new Node(-3);
    root.left=a;
    root.right=b;
    Node c = new Node(-4);
    Node d = new Node(-5);
    a.left = c;
    a.right = d;
    Node e = new Node(-6);
    Node f = new Node(-7);
    b.left = f;
    b.right = e;
    preorder(root);
    System.out.println(size); //SASTA SOLUTION:for size kinfdly follow the siezee() waala function
    System.out.println("size:"+sizee(root));
    System.out.println("sum:"+sum(root));
    System.out.println("max:"+maxi(root));
  }
  }
  

