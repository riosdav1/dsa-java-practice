package codinginterview.arraysandstrings;

public class StringCompression {

	public static void main(String[] args) {
		System.out.println(compress("aabcccccaaa")); // a2blc5a3
		System.out.println(compress("aa")); // aa
		System.out.println(compress("aab")); // aab
		System.out.println(compress("aabbb")); // a2b3
	}

	private static String compress(String s) {
		if (s == null || s.length() == 2) {
			return s;
		}
		
		StringBuilder sb = new StringBuilder();
		
		int prev = s.charAt(0);
		int sum = 1;
		for (int i = 1; i < s.length(); i++) {
			char current = s.charAt(i);
			if (current == prev) {
				sum++;
			} else {
				sb.append((char)prev).append(sum);
				sum = 1;
				prev = current;
			}
		}
		sb.append((char)prev).append(sum);
		
		String r = sb.toString();
		return r.length() < s.length() ? r : s;
	}
}
