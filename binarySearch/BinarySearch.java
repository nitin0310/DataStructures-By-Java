package binarySearch;

import java.util.Scanner;
import java.util.Arrays;

public class BinarySearch {
	public static void main(String args[]) {
		
		int arr[] = {12,34,33,8,44,9};
		
		System.out.println("Sorted array : ");
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
		Scanner scan = new Scanner(System.in);
		System.out.println("\nEnter no. you want to search");
		int num = scan.nextInt();
		
		binarySearch(0,arr.length-1,num,arr);
	}
	
	static void binarySearch(int beg,int end,int n,int a[]) {
		int mid = (beg+end)/2;
		
		while(beg<=end) {
			if(a[mid]==n) {
				System.out.println("Item found at : "+mid);
				break;
			}else if(n<a[mid]){
				end = mid-1;
			}else {
				beg = mid+1;
			}
			
			mid = (beg+end)/2;
		}
		
		
		if(beg>end) {
			System.out.println("Element not found in array");
		}
	}

}
