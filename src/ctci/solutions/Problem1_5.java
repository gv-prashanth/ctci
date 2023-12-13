package ctci.solutions;

public class Problem1_5 {

  public static void main(String[] args) {
    String input1 = "pales";
    String input2 = "bale";
    System.out.println(isOneAway(input1, input2));
  }

  // O(n) time
  // O(n) space
  private static boolean isOneAway(String input1, String input2) {
    if (input1.length() == input2.length()) {
      // check for 1 edit
      int editReq = 0;
      for (int i = 0; i < input1.length(); i++) {
        if (input1.charAt(i) != input2.charAt(i))
          editReq++;
      }
      return editReq <= 1;
    } else if (input1.length() < input2.length()) {
      // check for 1 add
      int issuePoint = -1;
      for (int i = 0; i < input1.length(); i++) {
        if (input1.charAt(i) != input2.charAt(i)) {
          issuePoint = i;
          break;
        }
      }
      if(issuePoint == -1)
        return true;
      for (int i = issuePoint; i < input1.length(); i++) {
        if (input1.charAt(i) != input2.charAt(i+1))
          return false;
      }
      return true;
    } else {
      // check for 1 add
      int issuePoint = -1;
      for (int i = 0; i < input2.length(); i++) {
        if (input2.charAt(i) != input1.charAt(i)) {
          issuePoint = i;
          break;
        }
      }
      if(issuePoint == -1)
        return true;
      for (int i = issuePoint; i < input2.length(); i++) {
        if (input2.charAt(i) != input1.charAt(i+1))
          return false;
      }
      return true;
    }
  }

}
