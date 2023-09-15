package class2_o;

public class stackandHeap {
  static int val = 5; //global variable is stored in heap memory and changes made in heap remains there forever
  public static void main(String[] args) {
    
    System.out.println("hi");
    fun1();
    fun2();
  }
  private static void fun2(){
    System.out.println("this is fun2");
    System.out.println(val);
  }
  private static void fun1(){
    val=11;
    System.out.println("this is fun1");
    System.out.println(val);
  }
}
