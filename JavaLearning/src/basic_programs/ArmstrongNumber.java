package basic_programs;

import java.util.Scanner;

public class ArmstrongNumber {
	//Sum of the power of digits in the number = number itself
	//ex. 153,1634 are arm strong number
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int num, originalNum, n=0, remainder;
		double result=0;
		System.out.print("Enter the number: ");
		num=scn.nextInt();
		originalNum = num;
		while(originalNum !=0) {
			originalNum /= 10;
			++n;
		}
		
		originalNum = num;
		while(originalNum !=0) {
			remainder = originalNum % 10;
			result += Math.pow(remainder, n);
			originalNum /= 10;
		}
		
		if(result == num ) {
			System.out.println(num + " is an Armstrong number");
		} else {
			System.out.println(num+ " is Not an Armstrong number");
		}
	}

}
