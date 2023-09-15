import java.util.*;
public class Map_Demo {
  public static void main(String[] args) {
    HashMap<Integer, String> map = new HashMap<>();
    map.put(3, "abc");
    map.put(1, "ghi");
    map.put(2, "def");
    map.put(3,"awe");//duplicTE KEY Cnnot be there ,recent value is updated for the same key
    System.out.println(map);
    System.out.println(map.get(1));
    System.out.println(map.get(40));  //if this key not there then it returns the alue null
    System.out.println(map.containsKey(40));//RETURNS TRUE OR FALSE
   // map.put(null,"sh");    //key ki value null ho sakti hai but key null nhi ho skti
    System.out.println(map.keySet());//returns set of all the keys
    Set <Integer>set = map.keySet();//referce variable for the set ="set".
    //ek ek key bhijenge is loop mein
    for(int a : set){
      System.out.println(a+": "+map.get(a) );
    }
    for(int a : map.keySet()){
       System.out.println(a+": "+map.get(a) );
      
     }


  }

}
