package com.manicrover;

import java.util.Scanner;

public class Input {

  public static void main(String[] args) {
    System.out.println("user input :");
    Scanner sc = new Scanner(System.in);

    // int a = sc.nextInt();
    // System.out.println(a);

    // boolean b = sc.hasNextBoolean();
    // System.out.println(b);

    // String c = sc.nextLine();
    // System.out.print(c);

    boolean d = sc.hasNextByte();
    System.out.println(d);
  }
}
