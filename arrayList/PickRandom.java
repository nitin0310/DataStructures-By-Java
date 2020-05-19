package arrayList;
import java.util.*;


public class PickRandom {
	public static void main(String args[]) {
		
		List<String> list=new ArrayList<>();
		list.add("Shubham");
		list.add("Ritik");
		list.add("Vikas");
		list.add("Sameer");
		list.add("Pratik");
		
		System.out.println(list);
		Random random=new Random();
		System.out.println(list.get(random.nextInt(list.size())));
	}
}
