package com.geeks;

interface Pahiya {
  public void rotate();
}

class MRFTyre implements Pahiya{
  public void rotate(){
    System.out.println("rotation....");
  }
}

public class Interface {

  public static void main(String[] args) {
    MRFTyre t = new MRFTyre();
    t.rotate();
  }
}
