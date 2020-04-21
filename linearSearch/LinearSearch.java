package linearSearch;
import java.util.Scanner;

public class LinearSearch {

	public static void main(String args[]) {
		int arr[] = {3,56,78,43,8,67};
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter no. to search");
		int num = scan.nextInt();
		int n = arr.length;
		int index=-1;
		
		for(int i=0;i<n;i++) {
			if(arr[i]==num) {
				index = i;
			}
		}
		
		if(index == -1) {
			System.out.print("Item not found");
		}else {
			System.out.print("Item found at : "+index);
		}
	}
	
}
