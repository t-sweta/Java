package ArrayQuestion;
import java.util.*;
public class dectobin {
  public static long binary(int dec){
    long bin = 0;
    int place = 1;
    while(dec!=0){
      int rem = dec%2;
      bin=bin+rem*place;
      place=place*10;
      dec=dec/2;

    }
    return bin;


  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int dec = sc.nextInt();
    long bun = binary(dec);
    System.out.println(bun);
;  }
  
}
