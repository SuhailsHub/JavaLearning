package basic_programs;

public class PyramidPattern {

	public static void main(String[] args) {
		int odd =1,n=5,s=n-1;
		
		for(int j=1; j<=n; j++) {
			for(int i=1; i<=s; i++) {
				System.out.print(" ");
			}
			for(int i=1; i<=odd; i++) {
				System.out.print("*");
			}
			System.out.println();
			odd+=2;
			s--;
		}
	}

}
