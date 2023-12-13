package ctci.solutions;

import java.util.HashMap;
import java.util.Map;

public class Problem1_4 {


  public static void main(String[] args) {
    char[] input = "Tact Coa".toLowerCase().toCharArray();
    System.out.println(isPP(input));
  }

  // O(n) time
  // O(n) space
  private static boolean isPP(char[] inpt) {
    Map<Character, Integer> register = new HashMap<>();
    for(char x : inpt) {
      if(x == " ".charAt(0))
        ;//do nothing
      else if(register.containsKey(x))
        register.put(x, register.get(x)+1);
      else
        register.put(x, 1);
    }
    return register.values().stream().filter(x -> x%2!=0).count() <= 1;
  }

}
