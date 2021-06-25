// program to calculate income tax
/*
<2.5 lak         -- 0%
2.5 to 5  lacks  -- 5%
5   to 10 lacks  -- 20%
10 lacks plus    -- 30%
*/
package man;

import java.util.Scanner;

public class IncomeTaxCalc {
  public static void main(String[] args) {

    while (true) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter your income : ₹");
      float inc = sc.nextFloat();
      float tax = 0;
      if (inc <= 250000f) {
        tax = 0;
      } else if (inc <= 500000f && inc > 250000f) {
        tax = inc * 0.05f;
      } else if (inc <= 1000000f && inc > 500000f) {
        tax = inc * 0.2f;
      } else if (inc > 1000000) {
        tax = inc * 0.3f;
      }
      System.out.println("you have to pay ₹" + tax + " as tax.\n");
      sc.close(); // closing scanner is important...!
    }
  }
}

// Harry se puchna hai float return kyun nhi ho rha??{}
