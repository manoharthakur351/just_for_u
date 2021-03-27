package com.manicrover;

import java.util.Scanner;

public class Greeting {

  public static void main(String[] args) {

    Scanner inp = new Scanner(System.in);

    System.out.print("your name : ");
    String name = inp.nextLine();
    System.out.printf("hello %s have a good day !!", name);
  }
}
