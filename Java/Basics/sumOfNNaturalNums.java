package manicrover;

public class sumOfNNaturalNums {

  static int sumUpTo(int n) {
    return (n * (n + 1)) / 2;
  }

  public static void main(String[] args) {
    System.out.println(sumUpTo(10));
  }
}
