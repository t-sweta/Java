import java.util.*;
public class sequenceArray {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] arr = {3,2,1};
    sequence(0,arr, new ArrayList<Integer>());


  }
  public static void sequence(int ind,int[] arr,ArrayList<Integer> sl){
    // ArrayList<Integer> sl = new  ArrayList<>();
    int n = arr.length;
    if(ind>=n){
      System.out.println(sl);
      return;
    }
    //include the current element in the subset
    sl.add(arr[ind]);
    sequence(ind+1,arr,sl);
    // exclude the current index form the subset
    sl.remove(sl.size()-1);
    sequence(ind+1,arr,sl);
  }
  
}
// You need to pass the ArrayList sl as an argument to the sequence function, as this ArrayList stores the current subset being generated.
