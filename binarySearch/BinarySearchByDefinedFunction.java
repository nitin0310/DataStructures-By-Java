package binarySearch;
import java.util.Scanner;
import java.util.Arrays;

public class BinarySearchByDefinedFunction {

	public static void main(String[] args) {
		int a[] = {12,56,32,78,90,22};
		Arrays.sort(a);
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Sorted array : ");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		
		System.out.println("\nEnter num to search in array");
		int num = scan.nextInt();
		
		int result = Arrays.binarySearch(a, num);
		
		if(result<0) {
			System.out.println("Item not present in array");
		}else {
			System.out.println("Item found at : "+result);
		}
	}

}
