package task2;

public class Main {
   public static void main(String[] args) {
      // Нет массива
      int[] intArray = new int[] { 2, 5, 6, 7, 8, 9, 1, 10, 11, 12, 13 };
      try {
         int d = 0;
         double catchedRes1 = intArray[8] / d;
         System.out.println("catchedRes1 = " + catchedRes1);
      } catch (ArithmeticException e) {
         System.out.println("Catching exception: " + e);
      }
   }
}