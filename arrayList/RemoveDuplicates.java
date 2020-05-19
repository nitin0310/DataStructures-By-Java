package arrayList;
import java.util.*;

public class RemoveDuplicates {
	public static void main(String args[]) {
		List<Integer> list=new ArrayList<>();
		
		list.add(10);
		list.add(20);
		list.add(10);
		list.add(10);
		
		System.out.println("Original array : ");
		System.out.println(list);
		List<Integer> newList=new ArrayList<Integer>();
		
		for(int i=0;i<list.size();i++) {
			if(!newList.contains(list.get(i))) {
				newList.add(list.get(i));
			}
		}
		System.out.println("Original array : ");
		System.out.println(newList);
		
	}
}
