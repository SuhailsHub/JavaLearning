package basic_programs.patters;

import java.util.Scanner;

public class LeftUpLadder {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = scn.nextInt();
		int i,j;
		for(i=num;i>=1;i--) {
			for(j=i;j<num;j++) {
				System.out.print(" ");
			}
			for(j=i;j>=1;j--) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
