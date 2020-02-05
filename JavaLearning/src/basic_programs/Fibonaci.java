package basic_programs;

public class Fibonaci {

	public static void main(String[] args) {
		
		int a=0,n=10,b=0,c=1;
		for(int i=1;i<=n;i++) {
			a=b;
			b=c;
			c=a+b;
			System.out.print(a+" ");
		}

	}

}
