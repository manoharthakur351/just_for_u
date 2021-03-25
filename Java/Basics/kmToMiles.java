package com.manicrover;

import java.util.Scanner;

public class kmToMile {

  public static void main(String[] args) {

    // creating a scanner instance.
    Scanner input = new Scanner(System.in);

    // input from user (kilometre).
    System.out.println("enter value in kilometres : ");
    float kilometres = input.nextFloat();

    // convert kilometres to miles.
    float miles = kilometres * 0.621371f;

    // printing results
    System.out.print(kilometres);
    System.out.print(" km = ");
    System.out.print(miles);
    System.out.println(" miles.");
  }
}
