package basic_programs;

import java.util.Arrays;

public class SortingChar {

	public static void main(String[] args) {
		String str="java";
		
		char[] chr=str.toCharArray();
		Arrays.sort(chr);
		for(char c: chr) {
			System.out.print(c);
		}

	}

}
