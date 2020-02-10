package basic_programs.patters;

import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("enter the number");
		int num = scn.nextInt();
		int i,j;
		for(i=1;i<=num;i++) {
			for(j=i;j<num;j++) {
				System.out.print(" ");
			}
			for(j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
