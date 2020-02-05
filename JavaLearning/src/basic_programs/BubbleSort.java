package basic_programs;

public class BubbleSort {

	public static void main(String[] args) {
		int[] arr = {8,3,6,9,11,2,5,10};
		int temp;
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1;j<arr.length; j++) {
				if(arr[i]>arr[j]) { //for descending order use <
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int n: arr){
			System.out.print(n+" ");
		}
	}

}
