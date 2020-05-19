package arrayList;
import java.util.*;

public class MaxAndMin2 {
	public static void main(String args[]) {
		List<Integer> list=new ArrayList<>();
		
		list.add(10);
		list.add(10);
		list.add(30);
		list.add(60);
		list.add(70);
		
		int max=0,min=0;
		min=list.get(0);
		max=min;
		
		for(int i=0;i<list.size()-1;i++) {
			if(max<list.get(i+1)) {
				max=list.get(i+1);
			}
			
			if(list.get(i)>list.get(i+1)) {
				min=list.get(i+1);
			}
		}
		
		System.out.println("Max : "+max);
		System.out.println("Min : "+min);
	}
}
