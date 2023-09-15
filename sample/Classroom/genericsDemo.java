package Classroom;

public class genericsDemo {
  // public void display(Integer arr[]){
  //   for(int i = 0;i<arr.length;i++){
  //     System.out.println(arr[i]+" ");
    
  //   }
  //   System.out.println();

  // }
  public static <T> void display(T arr[]){
    for(int i =0;i<arr.length;i++){
      System.out.println(arr[i]+" ");

    }
    System.out.println();//this is the GENERIC FUNTION works on any datatype like sort function
  }
  public static void main(String[] args) {
    Integer[] arr1 = {1,2,3,4};
    String[] arr2 = {"xyz","abc","mnno"};
    display(arr1);
    display(arr2);//above display function will throw error since irs made for integer type.one way is to make another display function for strings.another way is generic fucntion thwe same way sort function is made.
    //sort fucntion works on any datatype
    Arrays.sort(arr2);
    Arrays.sort(arr1);


  }
  
}
