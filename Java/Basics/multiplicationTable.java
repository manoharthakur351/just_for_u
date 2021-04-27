package manicrover;

public class Table {

  static void printTable(int a) { //creating a new function.
    for (int i = 1; i <= 10; i++) {
      System.out.format("%d × %d = %d\n", a, i, a * i);
    }
  }

  public static void main(String[] args) {
    printTable(10); // invitation
  }
}
