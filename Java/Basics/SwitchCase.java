package com.manicrover;

import java.util.Scanner;

public class SwitchCase {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int a;
    while (true) {

      a = input.nextInt();

      switch (a) {
        case 100:
          System.out.println("hundred");
          break;
        case 200:
          System.out.println("two hundred");
          break;
        case 300:
          System.out.println("three hundred");
          break;
        default:
        System.out.println("no value");
      }
    }
  }
}
