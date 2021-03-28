package manicrover;

public class OperatingArrays {

  public static void main(String[] args) {
    // how to calculate length of a array.
    /*
    int[] stuff = {1, 2, 3, 4};
    System.out.print("length of the array is : ");
    System.out.println(stuff.length);
    */

    // traversing an array and printing it using for loop.

    float[] values;
    values = new float[3];
    values[0] = 1;
    values[1] = 13;
    values[2] = 100;

    for (int i = 0; i < values.length; i++) {
      System.out.println(values[i]);
    }
  }
}
