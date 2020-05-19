package arrayList;
import java.util.*;

public class SplitAList {
	public static void main(String args[]) {
		List<Integer> list=new ArrayList<>();
		
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		
		System.out.println("first : ");
		for(int i=0;i<list.size()/2;i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("second : ");
		for(int i=list.size()/2;i<list.size();i++) {
			System.out.println(list.get(i));
		}
	}
}
