package com.manicrover;

import java.util.Scanner;

public class Practice3 {

  public static void main(String[] args) {

    // program to convert a string into lower case
    Scanner inp = new Scanner(System.in);

    
    while (true){
    String str = inp.nextLine();
    String r = str.toLowerCase();
      System.out.println(r);
    }
  }
}
