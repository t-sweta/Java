package Classroom;

import java.util.Comparator;

public class speedComparator implements Comparator<Car> {
  
  @Override
  public int compare(Car o1,Car o2){
    return o1.speed - o2.speed;
  }
}
