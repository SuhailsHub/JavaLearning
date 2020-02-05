package basic_programs;

public class PrimeNumber {

	public static void main(String[] args) {
		int num=12;
		boolean flag=true;
		for(int i=2;i<num/2;i++) {
			if(num%2==0) {
				flag=false;
				break;
			}
		}
		if(flag) {
			System.out.println("the numer is a prime number");
		}
		else {
			System.out.println("Not a prime number");
		}

	}

}
