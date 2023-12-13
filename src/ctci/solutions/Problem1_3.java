package ctci.solutions;

public class Problem1_3 {

  static char[] input = "Mr John Smith    ".toCharArray();
  static int trueLengh = 13;

  public static void main(String[] args) {
    System.out.println(input);
    processInputInplace();
    System.out.println(input);
  }

  // O(n) time
  // O(1) space
  private static void processInputInplace() {
    int rPointerPos = input.length - 1;
    int lPointerPos = trueLengh - 1;
    while (lPointerPos >= 0) {
      if (input[lPointerPos] ==  " ".charAt(0)) {
        input[rPointerPos] = "0".charAt(0);
        rPointerPos--;
        input[rPointerPos] = "2".charAt(0);
        rPointerPos--;
        input[rPointerPos] = "%".charAt(0);
        lPointerPos--;
        rPointerPos--;
      } else {
        input[rPointerPos] = input[lPointerPos];
        lPointerPos--;
        rPointerPos--;
      }
    }
  }

}
