package ctci.solutions;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Problem1_2 {

  public static void main(String[] args) {
    String input1 = "abcdefaghijklmn";
    String input2 = "bacdefghijkmlna";
    System.out.println("isPermutationWithNoExtraSpace: "+isPermutationWithNoExtraSpace(input1, input2));
    System.out.println("isPermutationWithExtraSpace: "+isPermutationWithExtraSpace(input1, input2));
  }

  //O(n) time
  //O(n) space
  private static boolean isPermutationWithExtraSpace(String input1, String input2) {
    Map<Character, Integer> register = new HashMap<>();
    for(char x : input1.toCharArray()) {
      if(register.containsKey(x))
         register.put(x, register.get(x)+1);
      else
         register.put(x, 1);
    }
    for(char x : input2.toCharArray()) {
      if(register.containsKey(x))
         register.put(x, register.get(x)-1);
      else
         return false;
    }
    return !register.values().stream().anyMatch(x -> x!=0);
  }
  
  //O(nlogn) time
  //O(1) space
  private static boolean isPermutationWithNoExtraSpace(String input1, String input2) {
    String x1 = input1.chars().sorted().mapToObj(x -> String.valueOf((char) x)).collect(Collectors.joining());
    String x2 = input2.chars().sorted().mapToObj(x -> String.valueOf((char) x)).collect(Collectors.joining());
    System.out.println(x1);
    System.out.println(x2);
    return x1.equals(x2);
  }

  
}
