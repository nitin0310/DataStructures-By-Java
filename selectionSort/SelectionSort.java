package selectionSort;

public class SelectionSort {
	
	public static void main(String args[]) {
		
		int a[] = {12,56,3,46,89,43,54,2};
		int n = a.length;
		
		System.out.println("Unsorted array : ");
		for(int i=0;i<n;i++) {
			System.out.print(a[i]+" ");
		}
		
		sortBySelectionSort(a,n);
		
		System.out.println("\nSorted array after selection sort: ");
		for(int i=0;i<n;i++) {
			System.out.print(a[i]+" ");
		}
		
	}
	
	static void sortBySelectionSort(int a[],int n) {
		int i,j,temp,min=0;
		
		for(i=0;i<n-1;i++) {
			min = i;  
			
			for(j=i+1;j<n;j++) {  //56----2
				if(a[min]>a[j]) {
					min=j;
				}
			}
			temp=a[min];
			a[min]=a[i];
			a[i]=temp;
		}
	}

}
