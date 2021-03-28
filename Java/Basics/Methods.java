package manicrover;

import manicrover.Methods;

public class Methods {

  // custom method (non static)
  int non(int a) {
    return a - a;
  }

  // custom method (static)
  static int doit(int a) {
    return a + 100;
  }

  // main method

  public static void main(String[] args) {

    // 1. simple way of method invokation.
    int x = doit(1);
    System.out.println(x);

    // 2. method invokation using object creation.
    Methods first = new Methods();
    int y = first.non(100);
    System.out.println(y);
  }
}
