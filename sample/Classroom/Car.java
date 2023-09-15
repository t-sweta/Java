package Classroom;

import java.util.Comparator;

//here we are comparing different type of values hence 
public class Car implements Comparable<Car> {
  int price;
  int speed;
  String color;

  public Car() {

  }

  public Car(int price, int speed, String color) {
    this.price = price;
    this.speed = speed;
    this.color = color;
  }

  @Override
  public String toString() {
    return " P:" + this.price + " S:" + this.speed + " C: " + this.color;
  }

  /*
   * @Override
   * public int compareTo(Car o) {
   * return this.price - o.price; //prblem is when i have to sort on the basis of
   * speed then yha speed likhna parega and for color then color ka change karna
   * parega code mein.speed k basis pe change akra to price k basisi pe hi ho
   * paaaega
   * }
   */
  // below we are setting boundaries below " <T extends Comparable<T>" udsing his
  // coz we want ki jo bhi car ki class k hai vo is array mein aak sort kare and
  // since car is using "Comparable" hence we are using this to set the boundaries
  // using comparable
  /*
   * /*
   * public <T extends Comparable<T>> void sort(T[] arr) {
   * for (int i = 0; i < arr.length; i++) {
   * for (int j = 0; j < arr.length - i - 1; j++) {
   * if (((Car) arr[j]).compareTo((Car) arr[j + 1]) > 0) {
   * T t = arr[j];
   * arr[j] = arr[j + 1];
   * arr[j + 1] = t;
   * }
   * }
   * }
   * }
   */
  public <T> void sort(T[] arr, Comparator<T> camp) {
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr.length - 1 - i; j++) {
        if (camp.compare(arr[j], arr[j + 1]) > 0) {
          T t = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = t;
        }
      }
    }
  }

  public void display(Car[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i] + " ");
    }
  }
  /*
   * UDHAV CODE
   * // according to price sorting done
   * public void sort(Car[] arr) {
   * for (int i = 0; i < arr.length - 1; i++) {
   * for (int j = i + 1; j < arr.length; j++) {
   * if (arr[i].price > arr[j].price) {
   * Car temp = arr[i];
   * arr[i] = arr[j];
   * arr[j] = temp;
   * }
   * }
   * }
   * 
   * }
   */

  @Override
  public int compareTo(Car o) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'compareTo'");
  }

}
