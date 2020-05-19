package arrayList;
import java.util.*;

public class FirstAndLast {
	public static void main(String args[]) {
		
		List<Integer> list=new ArrayList<>();

		list.add(10);
		list.add(10);
		list.add(30);
		list.add(60);
		list.add(70);
		
		System.out.println(list);
		System.out.println("First element : "+list.get(0));
		System.out.println("Last element : "+list.get(list.size()-1));
	}
}
