package com.manicrover;

import java.util.Scanner;

public class PercentageCalc {

  public static void main(String[] args) {
    // creating a scanner class
    Scanner input = new Scanner(System.in);

    // get desired marks per subject from user.
    System.out.println("marks out of :");
    int outOff = input.nextInt() * 5;
    System.out.print("total desired marks are ");
    System.out.println(outOff);

    System.out.println("enter markr of 5 subjects .");
    float sub1 = input.nextInt();
    float sub2 = input.nextInt();
    float sub3 = input.nextInt();
    float sub4 = input.nextInt();
    float sub5 = input.nextInt();

    float sum = sub1 + sub2 + sub3 + sub4 + sub5;
    System.out.print("total marks are ");
    System.out.print(sum);
    System.out.print(" out off  ");
    System.out.println(outOff);

    float ratio = sum / outOff;
    System.out.print("your ratio is ");
    System.out.println(ratio);

    float percent = ratio * 100;
    System.out.print("you got ");
    System.out.print(percent);
    System.out.println(" % marks");
  }
}
