package design_pattern.factory_pattern;

import java.util.Scanner;

public class GenerateBill {

	public static void main(String[] args) {
		System.out.println("Enter you Eb Plan: ");
		Scanner br= new Scanner(System.in);
		
		String plan=br.next();
		System.out.println("Enter the units consumed: ");
		int unit=br.nextInt();
		
		Plans pln = new Plans();
		
		Eb eb = pln.getPlan(plan);
		eb.getRate();
		eb.calculateBill(unit);

	}

}
