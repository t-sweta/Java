package ArrayQuestion;
import java.util.*;
public class secMax {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int [] arr= new int[5];
    for(int i =0;i<5;i++){
      arr[i]=sc.nextInt();
    }
    int lar = arr[0];
    int seclar = -1;
    for(int i =1;i<5;i++){
      if(arr[i]>lar){
        seclar=lar;
        lar=arr[i];
        
      }
      else if(arr[i]<lar && arr[i]>seclar){
        seclar =arr[i];
      }
    }
    System.out.println(seclar);
  }
  
}
