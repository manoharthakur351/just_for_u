package com.manicrover;

import java.util.Scanner;

public class SumFirstN {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    while (true) {
      int c = 0;
      int sum = 0;
      int n = sc.nextInt();
      while (c < n) {

        sum = sum + 2 * c;
        c++;
      }
      System.out.println(sum);
    }
  }
}
