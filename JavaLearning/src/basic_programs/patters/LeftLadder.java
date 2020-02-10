package basic_programs.patters;

import java.util.Scanner;

public class LeftLadder {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a number");
		int num=scn.nextInt();
		for(int j=1;j<=num;j++) {
			for(int i=1;i<=j;i++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
