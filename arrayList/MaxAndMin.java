package arrayList;
import java.util.*;

public class MaxAndMin {
	public static void main(String args[]) {
		
		List<Integer> list=new ArrayList<>();
		
		list.add(10);
		list.add(60);
		list.add(36);
		list.add(50);
		list.add(32);
		
		System.out.println(list);
		
		Collections.sort(list);
		System.out.println(list);
		
		System.out.println("Min : "+list.get(0));
		System.out.println("Max : "+list.get(list.size()-1));
	}
}
