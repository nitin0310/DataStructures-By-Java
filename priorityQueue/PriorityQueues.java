package priorityQueue;
import java.util.*;

public class PriorityQueues {
	public static void main(String args[]) {
		
		PriorityQueue<Integer> queue=new PriorityQueue<>();
		
//		queue.add("Ranter");
//		queue.add("Sam");
//		queue.add("York");
//		queue.add("Samuel");
//		queue.add("Brank");
		queue.add(91);
		queue.add(42);
		queue.add(45);
		queue.add(2);
		queue.add(53);
		
		Iterator itr=queue.iterator();
		
		while(itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}
	}
}
