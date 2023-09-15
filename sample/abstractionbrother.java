package sample;

public class abstractionbrother extends abstaction {
  public void sub(int a,int b){
    System.out.print(a-b);
  }
  public static void main(){
    abstactionbrother obj = new abstractionbrother();
    obj.sub(9,6);
  }

  
}
