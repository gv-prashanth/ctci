package ctci.solutions;

public class Problem1_8 {

  public static char[][] input = { { '0', '1', '2', '3' }, { '1', '0', '1', '1' }, { '2', '1', '3', '4' },
      { '0', '6', '1', '2' }, { '8', '6', '2', '2' } };
  public static int m = 5;
  public static int n = 4;

  public static void main(String[] args) {
    printInput();
    replaceWithS();
    replaceWith0();
    printInput();
  }

  // O(n^3) time
  // O(1) space
  private static void replaceWithS() {
    for (int x = 0; x < m; x++) {
      for (int y = 0; y < n; y++) {
        if (input[x][y] == '0') {
          markRowAsS(x);
          markColAsS(y);
        }
      }
    }
  }
  
  // O(n^2) time
  // O(1) space  
  private static void replaceWith0() {
    for (int x = 0; x < m; x++) {
      for (int y = 0; y < n; y++) {
        if (input[x][y] == '\u0000') {
          input[x][y] = '0';
        }
      }
    }
  }

  private static void markRowAsS(int x) {
    for (int i = 0; i < n; i++) {
      if (input[x][i] != '0')
        input[x][i] = '\u0000';
    }    
  }

  private static void markColAsS(int y) {
    for (int i = 0; i < m; i++) {
      if (input[i][y] != '0')
        input[i][y] = '\u0000';
    }
  }

  private static void printInput() {
    for (int i = 0; i < input.length; i++) {
      for (int j = 0; j < input[i].length; j++) {
        System.out.print(input[i][j]);
      }
      System.out.println();
    }
    System.out.println();
  }

}
