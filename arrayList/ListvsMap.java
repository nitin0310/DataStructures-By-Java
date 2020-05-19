package arrayList;
import java.util.*;

public class ListvsMap {
	public static void main(String args[]) {
		ArrayList<Integer> list=new ArrayList<>();
		
		list.add(23);
		list.add(33);
		list.add(50);
		list.add(45);
		list.add(21);
		
		System.out.println("List : ");
		System.out.println(list);
		System.out.println("Map : ");
		
		Map<Integer,String> map=new HashMap<>();
		
		map.put(1, "Shubham");
		map.put(2, "Ritik");
		map.put(3, "Manish");
		map.put(4, "Sameer");
		map.put(5, "Ashwani");
		
		System.out.println(map);
	}
}
