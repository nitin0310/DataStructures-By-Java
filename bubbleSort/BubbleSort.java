package bubbleSort;

public class BubbleSort {

	public static void main(String[] args) {
		
		int arr[] = {20,5,32,1,7,54,9,80};
		int n = arr.length;
		System.out.println("Unsorted array : ");

		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		
		sortByBubbleSort(arr,n);
		
		System.out.println("\nSorted array after bubblesort: ");

		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	static void sortByBubbleSort(int arr[],int n) {
		int i,j,temp;
		for(i=0;i<n-1;i++) {
			for(j=1;j<n;j++) {
				if(arr[j-1]>arr[j]) {
					
					temp=arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=temp;
					
				}
			}
		}
	}

}
