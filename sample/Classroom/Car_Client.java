package Classroom;

public class Car_Client {
  public static void main(String[] args) {
    Car c = new Car();
    Car[] arr = new Car[5];
    arr[0] = new Car(1200, 100, "white");
    arr[1] = new Car(1400, 80, "Black");
    arr[2] = new Car(1300, 90, "Yellow");
    arr[3] = new Car(1000, 110, "Green");
    arr[4] = new Car(1500, 60, "Blue");
    c.display(arr);
    System.out.println();
    //c.sort(arr);
    c.sort(arr,new speedComparator());
    c.display(arr);

  }

}
