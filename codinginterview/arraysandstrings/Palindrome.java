package codinginterview.arraysandstrings;

/**
 * This solution is better than the one in the book.
 * 
 * @author riosd
 *
 */
public class Palindrome {

	public static void main(String[] args) {
		System.out.println(isPalindrome(null)); // false
		System.out.println(isPalindrome("")); // false
		System.out.println(isPalindrome("T")); // false
		System.out.println(isPalindrome("Tact Coa")); // true
		System.out.println(isPalindrome("Tact Coaa")); // false
		System.out.println(isPalindrome("TactCoa")); // true
		System.out.println(isPalindrome("TactCoaa")); // false
		System.out.println(isPalindrome("TactCoamn")); // false
	}

	/*
	 * "Tact Coa" -> "tact coa" -> 1. chars[t:2, a:2, c:2, o:1]
	 * 
	 */
	private static boolean isPalindrome(String s) {
		if (s == null || s.length() <= 1) {
			return false;
		}
		
		int spaceCount = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == ' ') {
				spaceCount++;
			}
		}

		int[] chars = new int[128];
		for (int i = 0; i < s.length(); i++) {
			int c = s.charAt(i);
			if (c >= 65 && c <= 90) { // A..Z character?
				c += 32;
			}
			chars[c]++;
		}
		
		boolean oddCount = false;
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c != ' ' && chars[c] % 2 == 1) {
				if ((s.length() - spaceCount) % 2 == 0) {
					return false;
				}
				if (oddCount) {
					return false;
				} else {
					oddCount = true;
				}
			}
		}

		return true;
	}
}
