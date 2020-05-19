package dynamicQueues;
import java.util.*;

public class QueueArrayList {
	public static void main(String args[]) {
		
		Queue<Integer> queue=new LinkedList<>();
		
		System.out.println(queue.isEmpty());
		queue.add(10);
		queue.add(20);
		queue.add(30);
		queue.add(40);
		queue.add(50);
		System.out.println(queue);
		
		System.out.println(queue.remove()+" removed ");
		System.out.println(queue);
		System.out.println(queue.peek());
		System.out.println(queue.size());
	}
}
