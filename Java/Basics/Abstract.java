package com.geeks;

abstract class Phone {
  public abstract void call();

  public abstract void on();
}

class OppoPhone extends Phone {
  boolean onOff = false;

  @Override
  public void call() {
    if (this.onOff == true) {
      System.out.println("calling.......");
    } else {
      System.out.println("..............");
    }
  }

  @Override
  public void on() {
    this.onOff = true;
    System.out.println("turned on.....");
  }
}

public class Abstract {

  public static void main(String[] args) {
    OppoPhone a = new OppoPhone();
    // a.on();
    a.call();
  }
}
