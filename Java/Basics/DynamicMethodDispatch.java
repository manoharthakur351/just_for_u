package com.manicrover;

import com.manicrover.Phone;
import com.manicrover.SmartPhone;

class Phone {

  public void showTime() {
    System.out.println("time is 8:00 pm");
  }

  public void on() {
    System.out.println("turning on phone....");
  }
}

class SmartPhone extends Phone {

  public void playMusic() {
    System.out.println("playing music....");
  }

  public void on() {
    System.out.println("turning on Smart phone....");
  }
}

public class DynamicMethodDispatch {

  public static void main(String[] args) {
    Phone myphone = new SmartPhone();
    // SmartPhone s = new Phone(); #not allowed

    myphone.on(); // allowed
    myphone.showTime(); // allowed
    // myphone.playMusic(); (not allowed)
  }
}
