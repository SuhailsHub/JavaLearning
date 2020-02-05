package basic_programs;

import java.util.Scanner;

public class FloydsTriangle {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a number :");
		int num = 5, n=1;//scn.nextInt();
		
		for(int i = 1; i <= num; i++) {
			for (int j = 1; j <= i ; j++) {
				System.out.print(n+" ");
				n++;
			}
			System.out.println();
		}
	}

}
