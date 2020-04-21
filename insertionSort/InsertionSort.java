package insertionSort;
import java.util.Scanner;

public class InsertionSort {

	public static void main(String args[]) {
		
		Scanner scan = new Scanner(System.in);
		int a[] = new int[5];
		int n = a.length;
		
		System.out.println("Enter "+n+" numbers");
		for(int i=0;i<n;i++) {
			a[i] = scan.nextInt();
		}
		
		System.out.println("Sorted array : ");
		
		sortByInsertion(a,n);
		
		for(int i=0;i<n;i++) {
	     System.out.print(a[i]+" ");
		}
	}
	
	
	static void sortByInsertion(int a[],int n) {
		
		int i;
		for(int j=1;j<n;j++) {
			i=j-1;
			int key = a[j];
			while((i>-1) && a[i]>key) {
				a[i+1]=a[i];
				i--;
			}
			a[i+1]=key;
		}
	}
}
