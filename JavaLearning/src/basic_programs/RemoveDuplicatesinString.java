package basic_programs;

public class RemoveDuplicatesinString {

	public static void main(String[] args) {
		String sentence = "java is java not javascript";
		String[] word = sentence.split(" ");
		for(int i=0; i<word.length; i++) {
			System.out.print(word[i]+" ");
		}
		System.out.println();
		for(int i=0 ;i<word.length; i++) {
			int count=0;
			for(int j=i+1; j<word.length; j++) {
				//System.out.println(word[j]);
				if(word[i].equals(word[j])) {
					System.out.println("Duplicate word: "+word[j]);
					count++;
					word[j]="";
				}
			}
			if(count!=0)
				System.out.println("Number of time duplicate appeared:"+count);
		}
		for(int i=0; i<word.length; i++) {
			System.out.print(word[i]+" ");
		}

	}

}
