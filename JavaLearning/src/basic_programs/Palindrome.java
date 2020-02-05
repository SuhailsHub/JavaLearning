package basic_programs;

public class Palindrome {

	public static void main(String[] args) {
		String str = "Madam";
		String revs="";
		for(int i=str.length()-1; i>=0; i--) {
			revs=revs+str.charAt(i);
		}
		if(str.equalsIgnoreCase(revs)) {
			System.out.println("The given string is a palindrom");
		}else {
			System.out.println("not a palindrom");
		}
	}

}
