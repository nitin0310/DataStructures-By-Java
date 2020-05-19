package arrayList;
import java.util.*;

public class LinkedListVsLinkedHashSet {
	public static void main(String args[]) {
		
		//implements doubly linked list internally
		LinkedList<Integer> linkedList=new LinkedList<>();
		
		linkedList.add(10);
		linkedList.add(10);
		linkedList.add(30);
		linkedList.add(60);
		linkedList.add(70);
		
		System.out.println(linkedList);
		
		//implements hashMap internally
		
		LinkedHashSet<Integer> hashLinkedList=new LinkedHashSet<>();
		
		hashLinkedList.add(10);
		hashLinkedList.add(10);
		hashLinkedList.add(30);
		hashLinkedList.add(60);
		hashLinkedList.add(70);
		
		System.out.println(hashLinkedList);
	}
}
