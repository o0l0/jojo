public class Test{
  /** Main method */
  public static void main(String[] args) {
    // Declare and initialize variables
    int[] num = new int[2];
    num[0] = 1; num[1] = 2;

    System.out.println("Before invoking the swap method, num[0] is " +
      num[0] + " and num[1] is " + num[1]);

    // Invoke the swap method to attempt to swap two variables
    swap(num);

    System.out.println("After invoking the swap method, num[0]is " +
      num[0] + " and num[1] is " + num[1]);
  }

  /** Swap two variables */
  public static void swap(int[] n) {
    System.out.println("\tInside the swap method");
    System.out.println("\t\tBefore swapping n[0] is " + n[0]
      + " n[1] is " + n[1]);

    // Swap n1 with n2
    int temp = n[0];
    n[0] = n[1];
    n[1] = temp;

    System.out.println("\t\tAfter swapping n[0] is " + n[0]
      + " n[1]is " + n[1]);
  }
}
