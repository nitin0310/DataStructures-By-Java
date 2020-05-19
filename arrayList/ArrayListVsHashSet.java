package arrayList;
import java.util.*;

public class ArrayListVsHashSet {
	public static void main(String args[]) {
		List<Integer> list=new ArrayList<>();
		
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		
		System.out.println(list);
		
		Set<Integer> set=new HashSet<>();
		
		set.add(100);
		set.add(200);
		set.add(300);
		set.add(400);
		
		System.out.println(set);
	}
}
