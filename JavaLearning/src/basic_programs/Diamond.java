package basic_programs;

public class Diamond {
	
	public static void main(String[] args) {
		int rows=7,odd=1,s=rows-1,rev=0;
		for(int i=1; i<=rows; i++) {
			for(int space=1; space<=s;space++) {
				System.out.print(" ");
			}
			for(int j=1;j<=odd;j++) {
				System.out.print("*");
			}
			System.out.println();
			odd+=2;
			s--;
		}
		for(int i=rows-1; i>0;i--) {
			for(int j=1;j<=rows-i;j++) {
				System.out.print(" ");
			}
			for(int j=odd-4;j>0;j--) {
				System.out.print("*");
			}
			System.out.println();
			odd-=2;
		}
	}
}
