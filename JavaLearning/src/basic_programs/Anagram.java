package basic_programs;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String strn1="Mother in law";
		String strn2="Hitler Woman";
		String str1=strn1.replaceAll("\\s", "");
		String str2=strn2.replaceAll("\\s", "");
		char[] carr1=str1.toLowerCase().toCharArray();
		char[] carr2=str2.toLowerCase().toCharArray();
		
		Arrays.sort(carr1);
		Arrays.sort(carr2);
		boolean status= Arrays.equals(carr1, carr2);
		if(status) {
			System.out.println("Its an anagram");
		}else {
			System.out.println("not an anagram");
		}

	}

}
