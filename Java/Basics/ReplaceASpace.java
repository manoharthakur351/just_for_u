package com.manicrover;

import java.util.Scanner;

public class ReplaceASpace {

  public static void main(String[] args) {
	// program to replace white spaces with underscores.
    Scanner sc = new Scanner(System.in);

    System.out.print("enter a string : ");
    String input = sc.nextLine();
    
    String result = input.replace(' ','_');
    System.out.println("result = "+ result);
  }
}
