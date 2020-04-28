package queuesByLinkedList;

class Node{
	int data;
	Node next;
}

class Queue{
	
	Node front=null;
	Node rear=null;
	
	boolean isEmpty() {
		if(front==null && rear==null) {
			return true;
		}else {
			return false;
		}
	}
	
	void insert(int data) {
		Node n=new Node();
		n.data=data;
		
		if(isEmpty()) {
			n.next=null;
			front=rear=n;
		}else{
			n.next=null;
			rear.next=n;
			rear=n;
		}
	}
	
	void delete() {
		if(isEmpty()) {
			System.out.println("Can't delete.List is empty");
		}else if(front==rear) {
			front=rear=null;
		}else {
			System.out.println(front.data+" deleted successfully");
			front=front.next;
		}
	}
	
	void printQueue() {
		if(isEmpty()) {
			System.out.println("queue is empty");
		}else {
			Node temp=front;
			while(temp!=null) {
				System.out.println(temp.data);
				temp=temp.next;
			}
		}
	}
	
}

public class Queues {
	public static void main(String args[]) {
		
		Queue queue=new Queue();
		queue.printQueue();
		queue.insert(10);
		queue.insert(20);
		queue.insert(30);
		queue.printQueue();
		queue.delete();
		queue.printQueue();
	}

}
