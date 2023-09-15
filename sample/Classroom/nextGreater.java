package Classroom;
import java.util.*;

public class nextGreater {
  public static void main(String[] args) {
    
  
    Scanner sc = new Scanner(System.in);
    int [] arr = new int[5];
    int [] brr = new int[5];
    for(int k = 0;k<5;k++){
      arr[k]=sc.nextInt();
    }
    int i;
    for( i = 0;i<4;i++){
      if(arr[i]<arr[i+1]){
        brr[i]=arr[i+1];
      }
      else{
        brr[i]=-1;
      }

    }
    brr[i]=-1;
    for(int j = 0;j<4;j++){
      System.out.print(brr[j]+" ");
    }
}
  
}
