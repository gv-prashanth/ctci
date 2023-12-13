package ctci.solutions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Problem1_1 {

	public static void main(String[] args) {
		String input = "abcdefghijklmn";
		System.out.println("isUniqueNoAdditionalMemory: "+isUniqueNoAdditionalMemory(input.toCharArray()));
		System.out.println("isUniqueWithAdditionalMemory: "+isUniqueWithAdditionalMemory(input.toCharArray()));
	}

	//O(nlogn) time
	//O(1) space
	public static boolean isUniqueNoAdditionalMemory(char[] inChar) {
		Arrays.sort(inChar);
		for (int i = 0; i < inChar.length; i++) {
			if ((i + 1 < inChar.length) && inChar[i] == inChar[i + 1])
				return false;
		}
		return true;
	}

	//O(n) time
	//O(n) space
	public static Set<Character> chars = new HashSet<Character>();
	public static boolean isUniqueWithAdditionalMemory(char[] inChar) {
		for (int i = 0; i < inChar.length; i++) {
			chars.add(inChar[i]);
		}
		return chars.size() == inChar.length;
	}

}
