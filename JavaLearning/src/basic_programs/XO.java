package basic_programs;

public class XO {
	
	public static boolean getXO(String str) {
		str=str.toLowerCase();
		boolean rtn=false;
		int x=0,o=0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='x') {
				x=x+1;
			}
			else if (str.charAt(i)=='o') {
				o=o+1;
			}
		}
		if(x==o) {
			rtn=true;
		}
		else {
			rtn=false;
		}
		return rtn;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String S=  "pzzzzzzx";
		boolean st=getXO(S);
		System.out.println(st);
	}

}
