package basic_programs;

import java.util.Scanner;

public class AsciiValue {

	public static void main(String[] args) {
		
		char c;
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a charecter : ");
		c=scn.next().charAt(0);
		int ascii = c;
		System.out.println("The ascii value is: "+ ascii);
	}

}
