package Classroom;
import java.util.*;

public class Arraylist {
  
  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>();
    list.add(10);
    list.add(20);
    
    list.add(30);
    System.out.println(list.size());
    list.add(40);
    System.out.println(list);
    list.remove(1);
    System.out.println(list);
    list.add(1,100);
    System.out.println(list);
    System.out.println(list.contains(200));//return true or false
    System.out.println(list.indexOf(1000));//returns -1 if that value is not present int the list
    System.out.println(list.size());  //tells the size of the arraylist
    //its dynamic in nature.grows and shriks.unlike array we don't need to specify its size in the begining
    ArrayList<Integer>list2= new  ArrayList<>();
    list2.add(100);
    list2.add(300);
    list2.add(400);
    list2.add(500);
    ArrayList<ArrayList<Integer>>list1 = new ArrayList<>();
    list1.add(list);
    list1.add(list2);
    System.out.println(list1);
    //for each loop on arraylist
    for(ArrayList k : list1){
      System.out.println(k);
    }
    for(ArrayList k : list1){
      for(int i = 0;i<k.size();i++){
        System.out.println(k.get(i));
      }
    }

  }
}
