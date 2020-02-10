package basic_programs.patters;

import java.util.Scanner;

public class RightIUPLadder {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a number");
		int num=scn.nextInt();
		int temp=num;
		for(int i=1;i<=num;i++) {
			for(int j=i;j<=num;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
