package manicrover;

import java.util.Scanner;
import java.util.Scanner;

public class FindIntInArray {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] nums = {1, 29, 39, 29, 49, 83, 62, 99, 55, 925, 610};

    while (true) {
      int value = sc.nextInt();
      for (int i = 0; i < nums.length; i++) {
        if (nums[i] == value) {
          System.out.print(nums[i]);
          System.out.println(" is present in the array.");
          char sta = 'y';
          break;
        }
      }
    }
  }
}
