package ArrayQuestion;
import java.util.*;
public class BinaryToDec {
  public static long BinToDec(long num){
    long decimal = 0;
    long i = 0;
    while(num != 0){
      long rem = num %10;
      decimal = decimal+rem * (long)Math.pow(2,i);
      i++;
      num=num/10;


    }
    return decimal;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long num = sc.nextLong();
    long dec = BinToDec(num);
    System.out.println(dec);

  }
  
}
