package Classroom;

import java.util.function.DoubleToIntFunction;

public class Multithreading implements Runnable {
  public void run() {
    for (int i = 0; i < 5; i++) {
      try {
        Thread.sleep(1000);

      } catch (Exception e) {
        System.out.println(e);
      }
      System.out.println(i);
    }
    System.out.println("Running...");
  }

  public static void main(String[] args) {
    Multithreading m1 = new Multithreading();
    Thread t1 = new Thread(m1);
    Thread t2 = new Thread(m1);
    t1.setName("A");
    t2.setName("B");
    System.out.println(t1.getName());
    System.out.println(t2.getName());
    System.out.println(t1.getPriority());// ig its the maximum priority given
   // t1.getPriority(15);      this raises exception SIR NE KAHA THA KI DO BAAR THREAD KO CALL KARNE PE KYA KARTA HAI CECK FROM VANSHIKA
    System.out.println(t2.getPriority());
    System.out.println(t1.isAlive());
    t1.start();
    System.out.println(t1.isAlive());
    t2.start();

  }

}
