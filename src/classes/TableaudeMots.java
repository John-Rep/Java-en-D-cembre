package classes;

import java.util.Arrays;

public class TableaudeMots {

	public static void main(String[] args) {
		
		String[] myTableau = {"word", "another", "big", "Spider!", "eek"};
		
		int[] values = wordLengths(myTableau);
		for (int i = 0; i < values.length; i++) {
			System.out.println(values[i]);
		}
		System.out.println(Arrays.toString(values));
		System.out.println(Arrays.toString(inverse(myTableau)));
		
	}
	
	public static int wordSum (String[] words) {
		int sum = 0;
		for (int i = 0; i < words.length; i++) {
			sum += words[i].length();
		}
		return sum;
	}
	
	public static int[] wordLengths (String[] words) {
		int[] lengths = new int[words.length];
		for (int i = 0; i < words.length; i++) {
			lengths[i] = words[i].length();
		}
		return lengths;
	}
	
	public static String[] inverse(String[] words) {
		String[] lengths = new String[words.length];
		for (int i = 0; i < words.length; i++) {
			lengths[i] = words[words.length - i - 1];
		}
		return lengths;
	}
	
}
