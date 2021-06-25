package manicrover;

import java.util.Scanner;

public class trianglePattern {

  static void pattern(int n) {
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print("* ");
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    while (true) {
    
      Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      if (a==0){
        break;
      }else {
      pattern(a);
      }
    }
  }
}
