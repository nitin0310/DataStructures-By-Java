package queuesByArray;

class Queue{
	int a[]=new int[10];
	int front,rear;
	
	Queue(){
		front=-1;
		rear=-1;
	}
	
	boolean isFull() {
		if(rear==a.length-1) {
			return true;
		}else {
			return false;
		}
	}
	
	boolean isEmpty() {
		if(front==-1 && rear==-1) {
			return true;
		}else {
			return false;
		}
	}
	
	void insert(int data) {
		if(isFull()) {
			System.out.println("Can't add item");
		}else if(isEmpty()) {
			front=rear=0;
			a[rear]=data;
		}else {
			rear++;
			a[rear]=data;
		}
	}
	
	void delete() {
		if(isEmpty()) {
		System.out.println("Can't delete item");
		}else if(front==0 && rear==0) {
			System.out.println(a[front]+" deleted successfully");
			front=rear=-1;
		}else {
			System.out.println(a[front]+" deleted successfully");
			front++;
		}
	}
	
	void printQueue() {
		if(isEmpty()) {
			System.out.println("Queue is empty");
		}else {
			for(int i=front;i<=rear;i++) {
				System.out.println(a[i]);
			}
		}
	}
	
	void peek() {
		if(isEmpty()) {
			System.out.println("Can't fond peek.List is empty");
		}else {
			System.out.println("Peek : "+a[front]);
		}
	}
	
	
}

public class Queues {
	public static void main(String args[]) {
		
		Queue queue = new Queue();
		queue.printQueue();
		queue.insert(10);
		queue.insert(20);
		queue.insert(30);
		queue.printQueue();
		queue.delete();
		queue.printQueue();
		queue.peek();
	}

}
