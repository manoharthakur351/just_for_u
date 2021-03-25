package com.manicrover;

import java.util.Scanner;

public class isInt {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // assigning input to Boolean.
    boolean is = input.hasNextInt();

    // printing output.
    System.out.print(is);
  }
}
