package arrayList;
import java.util.*;

public class RemoveSublist {
	public static void main(String args[]) {
		List<String> list=new ArrayList<>();
		
		list.add("Geeks");
		list.add("for");
		list.add("Geeks");
		System.out.println(list);
		List<String> c=new ArrayList<>();
		c.add("for");
		list.subList(1,2).clear();
		System.out.println("After removing for : ");
		System.out.println(list);
	}
}
