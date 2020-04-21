package binarySearch;
import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchByRecursion {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a[] = {1,43,56,78,65,32};
		Arrays.sort(a);
		
		System.out.println("Sorted array : ");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println("\nEnter no. to search");
		int num = scan.nextInt();
		int n = a.length;
		
		int result = binarySearch(0,n-1,num,a);
		if(result == -1) {
			System.out.println("Item not found");
		}else {
			System.out.println("Item found at : "+result);
		}
	}
	
	static int binarySearch(int beg,int end,int num,int a[]) {
		
		if(beg<=end) {
			int mid = (beg+end)/2;
			
			if(a[mid] == num) {
				return mid;
			}
			if(num<a[mid]) {
				return binarySearch(beg,mid-1,num,a);
			}else {
				return binarySearch(mid+1,end,num,a);
			}
			
		}
		return -1;
		
	}

}
