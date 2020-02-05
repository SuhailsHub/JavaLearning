package basic_programs;

public class PrintNumbers {
	static void print(int a,int b) {
		System.out.println(b);
		b++;
		if(b<=a)
			print(a,b);
	}
	
	public static void main(String[] args) {
		
		print(5,1);
	}
}
