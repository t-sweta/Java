import java.util.*;
public class subsequenceSumEqualsK {
  public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    int[] arr = {1,2,1};
    // subsequenceKSum2(0,new ArrayList<Integer>(),2,0,arr);
    // subsequenceKSum(0,new ArrayList<Integer>(),2,0,arr);
    System.out.println(countReturn(0,new ArrayList<Integer>(), 2, 0, arr)); //this returns the count of the no. of the desired subsequences formed



  }
  public static void subsequenceKSum(int i,ArrayList<Integer> al,int sum,int s,int[] arr){
    int n = arr.length;

    if(i==n){
      if(s==sum){
        System.out.println(al);
      }
      return;
    }
    al.add(arr[i]);
    s=s+arr[i];
    subsequenceKSum(i+1,al,2,s,arr);
    al.remove(al.size()-1);
    s=s-arr[i];
    subsequenceKSum(i+1, al, 2, s,arr);
    
  }
  // METHOD2   ===> (This will print only one answer,it can be any sequence,after printing oe sequence it will return a true and hence the funtion will be over)
  public static boolean subsequenceKSum2(int i,ArrayList<Integer> al,int sum,int s,int[] arr){
    int n = arr.length;

    if(i==n){
      if(s==sum){
        System.out.println(al);
        return true;
      }else{
        return false;
      }
    }
    al.add(arr[i]);
    s=s+arr[i];
    if(subsequenceKSum2(i+1,al,2,s,arr)){
      return true;
    }
    al.remove(al.size()-1);
    s=s-arr[i];
    if(subsequenceKSum2(i+1, al, 2, s,arr)){
      return true;
    }
    return false;
  }

  // METHOD3===>(THis returns the count of the no. of subsequences formed )
  public static int countReturn(int i,ArrayList<Integer> al,int sum,int s,int[] arr){
    int n = arr.length;

    if(i==n){
      if(s==sum){
        return 1;
      }else{
        return 0;
      }
    }
    al.add(arr[i]);
    s=s+arr[i];
    int l = countReturn(i+1,al,2,s,arr);
    al.remove(al.size()-1);
    s=s-arr[i];
    int r = countReturn(i+1, al, 2, s,arr);
    return l+r;
  }
  
}
