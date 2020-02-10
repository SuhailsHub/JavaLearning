package basic_programs.patters;

import java.util.Scanner;

public class RightLadder {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = 7,i,j;//scn.nextInt();
		for(i=1;i<=num;i++) {
			for(j=i;j<num;j++) {
				System.out.print(" ");
			}
			for(j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
