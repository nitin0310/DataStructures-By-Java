package selectionSort;
import java.util.Scanner;

public class SelectionSort2 {
	
	public static void main(String args[]) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter value of n?");
		int n=scan.nextInt();
		int a[] = new int[n];
		
		System.out.println("Enter "+n+" values : ");
		for(int i=0;i<n;i++) {
			a[i]=scan.nextInt();
		}
		
		System.out.println("Array is : ");
		for(int i=0;i<n;i++) {
			System.out.print(a[i]+" ");
		}
		
		System.out.println("\nApplying selection sort...");
		
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				int temp;
				if(a[i]>a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		
		
		System.out.println("Sorting array : ");
		for(int i=0;i<n;i++) {
			System.out.print(a[i]+" ");
		}
	}

}
