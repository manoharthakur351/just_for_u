package manicrover;

import manicrover.Student;

class Student {
  String name;

  // setters are always void
  public void setName(String new_name) {
    this.name = new_name;
  }
  // getters are not void
  public String getName() {
    return this.name;
  }
}

public class Constructors {

  public static void main(String[] args) {
    Student a = new Student();
    a.setName("mano");
    System.out.println(a.getName());
  }
}
