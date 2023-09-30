package task4;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    String str = inputStringFromUser();

    System.out.println(str);

  }

  public static String inputStringFromUser() {
    System.out.println("Введите строку ");
    String str = null;
    try (Scanner sc = new Scanner(System.in);) {
      str = sc.nextLine();
      if (str.isEmpty()) {
        throw new Exception("Введена пустая строка  ");
      }
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
    return str;
  }
}
