package regex;

import java.util.regex.Pattern;

public class RejexPatter {

	public static void main(String[] args) {
		
		System.out.println(Pattern.matches("^(.+)@{1}(.+)$", "Suhail887@gmail.com"));
		System.out.println(Pattern.matches("^[a-zA-Z0-9+_.-]+@{1}(.+)$","Suhail.887_SYED@gmail.com"));
	}

}
