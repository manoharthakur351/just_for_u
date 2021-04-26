package manicrover;

import java.util.Scanner;

public class Fabonacci { // method to print fabonacci series upto n
  static void fabRec(int n) {
    System.out.println(0 + "\n" + 1);
    int a = 0;
    int b = 1;
    int r = 0;
    for (int i = 0; i <= (n - 2); i++) {
      r = a + b;
      System.out.println(r);
      a = b;
      b = r;
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("fabonacci ip to : ");
    int n = sc.nextInt();
    fabRec(n);
  }
}
