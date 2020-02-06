package basic_programs.patters;

import java.util.Scanner;

public class SquareStar {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("enter the number:");
		int num = scn.nextInt();
		for(int i = 1; i<=num;i++) {
			for(int j=1; j<=num;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
