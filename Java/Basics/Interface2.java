package com.geeks;

interface Watch {
  public void showTime();
}

interface Camera {
  public void clickPhoto();
}

class SmartPhone implements Watch, Camera {
  @Override
  public void showTime() {
    System.out.println("4:00 am");
  }

  @Override
  public void clickPhoto() {
    System.out.println("clikk!!");
  }
}

public class Interface2 {

  public static void main(String[] args) {
    SmartPhone s = new SmartPhone();
    s.showTime();
    s.clickPhoto();
  }
}
