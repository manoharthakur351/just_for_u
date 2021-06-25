package com.geeks;



class Base {
  public Base() {
    System.out.println("base");
  }
}

class Derived1 extends Base {
  public Derived1() {
    System.out.println("derived 1");
  }

  public Derived1(int a) {
    System.out.println("yess");
  }
}

class Derived2 extends Derived1 {
  public Derived2() {
    super(1);
    System.out.println("derived 2");
  }
}

public class Inheritance {

  public static void main(String[] args) {
    Derived2 obj = new Derived2();
  }
}
