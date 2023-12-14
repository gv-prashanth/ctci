package ctci.solutions;

public class Problem1_9 {

  public static String s1 = "waterbottle";
  public static String s2 = "erbottlewat";

  public static void main(String[] args) {
    System.out.println(isSubstring(s1.concat(s1), s2));
  }

  //Give already
  private static boolean isSubstring(String concat, String s22) {
     return concat.contains(s22);
  }

}
