import java.util.*;
public class array1 {
  private static void swap(int a,int b){
    int c = a;
     a= b;
     b=c;
     System.out.print("a:"+a+"b:"+b);
     
    
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    //System.out.println(arr); [I@1ddc...[=one d, I=integer type,after @ is the memory address 
   // formula=(base add+ index*size of datatype)   -->hence indexing starts from zero
  /*int[] arr = {0,12,3};
  for(int i = 0;i<arr.length;i++){
    System.out.println(arr[i]);
    
  }
  */
  /* 
  int n = sc.nextInt();
  int [] arr = new int[n];//jvm reades the code inside main from right to left hence it checks the size first
  for(int i = 0;i<n;i++){//arays add is stired in stack memory and its value is made inside heap memory(hence changes made in array is always reflected )
    arr[i]=sc.nextInt();

  }
  for(int i = 0;i<n;i++){
    System.out.println(arr[i]);
  }
  */
  int a = 5;
  int b = 10;
  swap(a,b);
// check  if we  can swap two arays similarly
// swap(int [] arr1,int []arr2){
//   int [] temp = arr1;
//   arr1=arr2;
//   arr2=temp;
// }

    
  }
  
  
}
