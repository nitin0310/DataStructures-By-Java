package mergeSort;
import java.util.*;

public class Sorting {
	public static void main(String args[]) {
		int array[]= {9,3,7,5,6,4,8,2};
		
		Merge obj=new Merge();
		obj.mergeSort(array, 0, array.length-1);
		System.out.println();
		System.out.println("Sorted array : ");
		for(int i:array) {
			System.out.print(i+" ");
		}
	}
	
}

class Merge{
	
	public void mergeSort(int a[],int l,int h) {
		
		if(l<h) {					 //divide and conquer
			int mid=(l+h)/2;
			System.out.println("l: "+l+" h :"+h+" mid :"+mid);
			mergeSort(a,l,mid);
			mergeSort(a,mid+1,h);
			merge(a,l,mid,mid+1,h);
		}
	}
	
	
	public void merge(int[] array,int l1,int l2,int h1,int h2) {
		int temp[]=new int[h2-l1+1];		//to get size for temporary array
		int i=l1;
		int j=h1;
		int k=0;
		
		//if we use for loop it give O(n^2);
		//if we use while it give O(n);
		
		//1.check for null inputs
		//let arr1[12,4,3,66], arr2[];
		//let arr1[], arr2[2,77,54];
		
		
		
		while(i<=l2 && j<=h2) {
			System.out.println("i: "+i+" j: "+j);
			if(array[i]<array[j]) {
				temp[k]=array[i];
				System.out.println("temp["+k+"] ="+"array["+i+"] "+array[i]);
				i++;
			}else {
				temp[k]=array[j];
				System.out.println("temp["+k+"] ="+"array["+j+"] "+array[j]);
				j++;
			}
			k++;
		}
		
		while(i<=l2) {
			temp[k]=array[i];
			System.out.println("temp["+k+"] ="+"array["+i+"] "+array[i]);
			k++;
			i++;
		}
		while(j<=h2) {
			temp[k]=array[j];
			System.out.println("temp["+k+"] ="+"array["+j+"] "+array[j]);
			k++;
			j++;
		}
		
		for(int a=l1,v=0;a<=h2;a++,v++) {
			array[a]=temp[v];
		}
		
	}
	

}