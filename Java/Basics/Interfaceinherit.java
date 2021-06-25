package com.geeks;

import com.geeks.MySmartPhone;

class MyCell {
  public void call(long a) {
    System.out.println("calling " + a);
  }
}

interface MyCamera {
  public void clickPhoto();
}

interface GPS {
  public void locate();
}

class MySmartPhone extends MyCell implements GPS, MyCamera {

  @Override
  public void locate() {
    System.out.println("located a place....");
  }

  @Override
  public void clickPhoto() {
    System.out.println("clicked a photo....");
  }

  public void swipe() {
    System.out.println("swiped.............");
  }
}

public class InterfaceInherit {

  public static void main(String[] args) {
    MySmartPhone mob = new MySmartPhone();
    mob.call(2884938836l);

    MyCell mob1 = new MySmartPhone();
    mob1.call(74828746828l); //✓
    // mob1.swipe(); ×
    // mob1.locate(); ×

  }
}
