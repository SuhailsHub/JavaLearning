package basic_programs;

public class CharacterCount {

	public static void main(String[] args) {
		String str = "Geeks for Geeks a bcs";
		String[] word = str.split(" ");
		for(int i=0; i<word.length; i++) {
			System.out.println(word[i]+" = "+word[i].length());
		}

	}

}
