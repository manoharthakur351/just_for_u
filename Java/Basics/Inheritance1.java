package com.manicrover;

class Base {

  int x;

  public int getX() {

    return x;

  }

  public void setX(int a) {

    x = a;

  }

}

class Derived extends Base {

  int y;

  public int getY() {

    return y;

  }

  public void setY(int a) {

    y = a;

  }

}

public class Inheritance {

  public static void main(String[] args) {

    Derived d = new Derived();

    

    d.setX(100);

    d.setY(50);

   

    System.out.println(d.getX());

    System.out.println(d.getY());

  }

}

