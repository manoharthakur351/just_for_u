package com.geeks;

interface Camera2 {
  public void clickPhoto();

  /* default void nightMode(){
    System.out.println("night mode");
  }
  */
}

class Phone2 implements Camera2 {
  public void clickPhoto() {
    System.out.println("photo clicked...");
  }
}

public class Default {

  public static void main(String[] args) {
    Phone2 p = new Phone2();
    p.clickPhoto();
  }
}
