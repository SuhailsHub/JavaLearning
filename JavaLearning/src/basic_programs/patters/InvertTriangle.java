package basic_programs.patters;

import java.util.Scanner;

public class InvertTriangle {

	public static void main(String[] args) {
		
		System.out.println("Enter the number");
		Scanner scn = new Scanner(System.in);
		int num= scn.nextInt();
		int i,j;
		for(i=num;i>=1;i--) {
			for(j=i;j<num;j++) {
				System.out.print(" ");
			}
			for(j=i;j>=1;j--) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
