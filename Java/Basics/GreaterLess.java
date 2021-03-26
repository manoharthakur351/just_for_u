// program to find greater of two numbers

package com.manicrover.quiz;

import java.util.Scanner;

public class GreaterLess {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("enter first number >> ");
    int firstNum = input.nextInt();
    System.out.print("enter 2nd number >> ");
    int secNum = input.nextInt();

    if (firstNum > secNum) {
      System.out.printf("%d is grater than %d", firstNum, secNum);
    } else {
      System.out.format("%d is grater than %d", secNum, firstNum);
    }
  }
}
