package ctci.solutions;

public class Problem1_6 {

  public static void main(String[] args) {
    String input = "aaaabcccaccccd";
    System.out.println(strCompress(input.toCharArray()));
  }

  // O(n) time
  // O(1) space. Debatable since we are constructing a new string which is dependent on input string length.
  private static String strCompress(char[] inputAsChar) {
    StringBuilder strB = new StringBuilder();
    int leftPointer = 0;
    int rightPointer = 0;
    while (rightPointer < inputAsChar.length) {
      if (inputAsChar[rightPointer] == inputAsChar[leftPointer]) {
        // do nothing just keep going forward in next iteration
      } else {
        strB.append(inputAsChar[leftPointer]);
        strB.append(rightPointer - leftPointer);
        leftPointer = rightPointer;
      }
      rightPointer++;
    }
    strB.append(inputAsChar[leftPointer]);
    strB.append(rightPointer - leftPointer);
    String compressedStr = strB.toString();
    if(compressedStr.length() < inputAsChar.length)
      return compressedStr;
    else
      return String.valueOf(inputAsChar);
  }

}
