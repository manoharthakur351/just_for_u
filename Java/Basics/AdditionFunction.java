package com.manic;

public class VarArgs {

  static void sumit(int ...arr) {
    int result = 0;
    for (int a: arr) {
      result += a;
    }
    System.out.println(result);
  }

  public static void main(String[] args) {
    sumit();
  }
}
