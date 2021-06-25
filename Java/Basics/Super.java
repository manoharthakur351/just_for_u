package com.manicrover;

import com.manicrover.EkClass;

class EkClass {
  int a;

  EkClass(int a) {
    this.a = a;
  }

  public int getA() {
    return this.a;
  }
}

class DoClass extends EkClass {
  DoClass(int v) {
    super(v);
    System.out.println("constructor of doclass " + v);
  }
}

public class Super {

  public static void main(String[] args) {
    EkClass e = new EkClass(1);
    int val = e.getA();
    System.out.println(val);

    DoClass d = new DoClass(1);
  }
}
