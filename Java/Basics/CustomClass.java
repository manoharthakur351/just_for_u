package manicrover;

import manicrover.Phone;

class Phone {
  public String typ = "Phone";
  public int number;

  static void call(String name) {
    System.out.println("calling.. " + name);
  }

  static void click() {
    System.out.println("photo clicked");
  }
}

public class Cclass {

  public static void main(String[] args) {
    Phone my = new Phone();
    my.call("fameer");
    my.click();
    System.out.println(my.typ);
  }
}
