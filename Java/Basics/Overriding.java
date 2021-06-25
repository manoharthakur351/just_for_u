package com.manocrover;

import com.manocrover.Smartphone;

class Phone {
  int a;

  public void on() {
    System.out.println("turning on phone....");
  }

  public void showTime() {
    System.out.println("8:19 pm");
  }
}

class Smartphone extends Phone {
  @Override
  public void on() {
    System.out.println("turning on smart phone..  ");
  }

  public void playMusic(String a) {
    System.out.println("playing " + a);
  }
}

public class Overriding {

  public static void main(String[] args) {
    Smartphone s = new Smartphone();
    s.on();
    s.showTime();
    s.playMusic("billionera");

    Phone ss = new Smartphone();
    ss.on();
    ss.showTime();
  }
}
