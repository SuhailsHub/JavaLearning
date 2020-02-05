package basic_programs;

import java.util.Scanner;

public class SwapingNumbers {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the two numbers:");
		int num1 = scn.nextInt();
		int num2 = scn.nextInt();
		int temp;
		System.out.println("Before swap: "+num1+" "+num2);
		temp = num1;
		num1=num2;
		num2= temp;
		System.out.println("After swap: "+num1+" "+num2);
	}

}
