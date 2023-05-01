import java.util.Arrays;

public class Isomorphic {
    public static void main(String[] args) {
        System.out.println(isIsomorphic("egg", "add")); // true
        System.out.println(isIsomorphic("foo", "bar")); // false
        System.out.println(isIsomorphic("paper", "title")); // true
        System.out.println(isIsomorphic("badc", "baba")); // false
        /*
         * 1. e, a, [], [] -> [e], [a]
         * 2. g, d, [e], [a] -> [e,g], [a,d]
         * 3. g, d, [e,g], [a,d] -> true
         * 
         * 1. b, b, [], [] -> [b], [b]
         * 2. a, a, [b], [b] -> [b,a], [b,a]
         * 3. d, b, [b,a], [b,a] -> false
         */
    }

    private static boolean isIsomorphic(String s, String t) {
        int[] sourceChars = new int[256];
        Arrays.fill(sourceChars, -1);

        int[] targetChars = new int[256];
        Arrays.fill(targetChars, -1);

        for (int i = 0; i < s.length(); i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);

            if (sourceChars[sChar] == -1 && targetChars[tChar] == -1) {
                sourceChars[sChar] = tChar;
                targetChars[tChar] = sChar;
            } else if (!(sourceChars[sChar] == tChar && targetChars[tChar] == sChar)) {
                return false;
            }
        }

        return true;
    }
}
