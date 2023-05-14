package codinginterview.arraysandstrings;

import java.util.Arrays;

public class RotateMatrix {

	public static void main(String[] args) {
		int[][] image = { { 1, 2, 3, 4 }, { 11, 12, 13, 14 }, { 21, 22, 23, 24 }, { 31, 32, 33, 34 } };
		
		for (int i = 0; i < image.length; i++) {
			System.out.println(Arrays.toString(image[i]));
		}
		
		System.out.println();
		
		int[][] rotated = rotate(image);
		
		for (int i = 0; i < rotated.length; i++) {
			System.out.println(Arrays.toString(rotated[i]));
		}
	}

	/*
	 * [[ a1 a2 a3 a4 ] -> [[ d1 c1 b1 a1 ] [ b1 b2 b3 b4 ] [ d2 c2 b2 a2 ] [ c1 c2
	 * c3 c4 ] [ d3 c3 b3 a3 ] [ d1 d2 d3 d4 ]] [ d4 c4 b4 a4 ]]
	 */
	private static int[][] rotate(int[][] image) {
		if (image == null || image.length == 0 || image.length != image[0].length) {
			return image;
		}
		
		int[][] rotated = new int[image.length][image.length];
		
		for (int i = 0; i < image.length; i++) {
			for (int j = 0; j < image[i].length; j++) {
				rotated[j][image.length - i - 1] = image[i][j];
			}
		}

		return rotated;
	}
}
