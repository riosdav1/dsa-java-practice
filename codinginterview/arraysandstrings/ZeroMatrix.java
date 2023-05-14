package codinginterview.arraysandstrings;

import java.util.Arrays;

public class ZeroMatrix {

	public static void main(String[] args) {
		int[][] m = { { 1, 2, 3, 4 }, { 11, 12, 0, 14 }, { 21, 22, 23, 24 } };
		
		for (int i = 0; i < m.length; i++) {
			System.out.println(Arrays.toString(m[i]));
		}
		
		System.out.println();
		
		int[][] r = zero(m);
		
		for (int i = 0; i < r.length; i++) {
			System.out.println(Arrays.toString(r[i]));
		}
	}

	/*
	 * [ 1,  2,  3,  4] -> [ 1,  2,  0,  4]
	 * [11, 12,  0, 14]    [ 0,  0,  0,  0]
	 * [21, 22, 23, 24]    [21, 22,  0, 24]
	 */
	private static int[][] zero(int[][] m) {
		if (m == null || m.length == 0) {
			return m;
		}
		
		int[][] r = new int[m.length][m[0].length];
		int index = -1;
		
		for (int i = 0; i < m.length; i++) {
			boolean isZero = false;
			for (int j = 0; j < m[i].length; j++) {
				if (m[i][j] == 0) {
					isZero = true;
					index = j;
					for (int k = 0; k < i; k++) {
						r[k][j] = 0;
					}
				}
			}
			
			for (int j = 0; j < m[i].length; j++) {
				if (isZero) {
					r[i][j] = 0;
				} else {
					if (j == index) {
						r[i][j] = 0;
					} else {
						r[i][j] = m[i][j];
					}
				}
			}
		}
		
		return r;
	}
}
