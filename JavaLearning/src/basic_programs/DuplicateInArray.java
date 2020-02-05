package basic_programs;

import java.util.HashSet;

public class DuplicateInArray {

	public static void main(String[] args) {
		String[] strArray = {"abc", "def", "mno", "xyz", "pqr", "xyz", "def"};
		
		for(int i=0; i<strArray.length; i++) {
			for(int j= i+1; j<strArray.length;j++) {
				if(strArray[i].equals(strArray[j])) {
					System.out.println("Duplicate : "+strArray[j]);
				}
			}
		}
		HashSet<String> set = new HashSet<String> ();
		for(int i=0; i<strArray.length; i++) {
			if(!set.add(strArray[i])) {
				System.out.println("Duplicate: "+strArray[i]);
			}
		}

	}

}
