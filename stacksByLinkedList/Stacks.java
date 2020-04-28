package stacksByLinkedList;

class Node{
	
	int data;
	Node next;
	
	Node(){
		data = 0;
		next=null;
	}
	
	Node(int data){
		this.data = data;
	}
	
}

class Stack{
	Node top;
	
	Stack(){
		top=null;
	}
	
	void push(int data) {
		Node n = new Node();
		n.data=data;
		if(top==null) {
			n.next=null;
		}else {
			n.next=top;
		}
		top=n;
	}
	
	void pop() {
		if(top==null) {
			System.out.println("Stacl underflow");
		}else {
			top=top.next;
		}
	}
	
	void printstack() {
		Node temp=top;
		if(temp==null) {
			System.out.println("Stack is empty");
		}else {
			while(temp.next!=null) {
				System.out.println(temp.data);
				temp=temp.next;
			}
			System.out.print(temp.data);
		}
	}
	
}

public class Stacks {

	public static void main(String[] args) {
		Stack stack=new Stack();
		stack.printstack();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.printstack();
		System.out.println();
		System.out.println("---");
		stack.pop();
		stack.printstack();
		System.out.println();
		System.out.println("---");
		stack.pop();
		stack.printstack();
	}

}
