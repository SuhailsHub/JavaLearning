package basic_programs;

import java.util.Scanner;

public class ToPrintnumber {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num= scn.nextInt();
		for (int i=1,j=num; i<=num && j>0 ;i++,j--) {
			System.out.print(i+" "+j);
			System.out.println();
		}
		System.out.println();
		
		for(int i=num; i>0;i--) {
			
		}

	}

}
