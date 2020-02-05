package basic_programs;

public class ReverseEachLetter {

	static void reverseLetter(String sentence) {
		
		//Split the Sentence to words 
		String[] words = sentence.split(" ");
		String reverseSen = "";
		for(int i=0; i<words.length; i++) {
			
			String word = words[i];
			String reverseWord="";
			for(int j=(word.length())-1; j>=0; j--) {

				reverseWord = reverseWord + word.charAt(j);

			}

			reverseSen = reverseSen + reverseWord +" ";
		}

		System.out.println("The given Sentence : "+sentence);
		System.out.println("The Reverse of the sentence letters: "+reverseSen);
		
	}
	public static void main(String[] args) {
		
		reverseLetter("Java is Platform Independent");
		
	}

}
