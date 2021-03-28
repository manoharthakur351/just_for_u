package manicrover;

import java.util.Scanner;

public class SumArray {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    float[] five = new float[5];
    System.out.println("enter 5 floats : ");
    five[0] = sc.nextFloat();
    five[1] = sc.nextFloat();
    five[2] = sc.nextFloat();
    five[3] = sc.nextFloat();
    five[4] = sc.nextFloat();
    float sum = 0;
    for (float element : five) {
      sum = sum + element;
    }
    System.out.print("sum = ");
    System.out.println(sum);
  }
}
