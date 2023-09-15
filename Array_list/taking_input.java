package Array_list;
import java.util.*;

import javax.sound.sampled.SourceDataLine;
public class taking_input {
  public static void main(String[] args) {
    
  
    ArrayList<Integer> l = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    
    for(int i =0;i<3;i++){
      int n = sc.nextInt();
      l.add(n);
    

    }
    System.out.println(l);

  }
  

  
}
