package stacksByArray;

class Stack{
	int top;
	int a[]=new int[10];
	
	Stack(){
		top=-1;
	}
	
	void push(int data) {
		if(top==a.length-1) {
			System.out.println("Stack overflow");
		}else {
			top++;
			a[top]=data;
			System.out.println("Data added successfully "+a[top]);
		}
	}
	
	void pop() {
		if(top==-1) {
			System.out.println("Stack Underflow");
		}else {
			top--;
			System.out.println("Data removed successfully "+a[top+1]);
		}
	}
	
	void printStack() {
		if(top==-1) {
			System.out.println("Stack is empty");
		}else {
			for(int i=top;i>=0;i--) {
				System.out.print(a[i]);
				System.out.println();
			}
		}
	}
	
}

public class Stacks {
	public static void main(String args[]) {
		
		Stack stack=new Stack();
		stack.printStack();
		stack.push(10);
		stack.printStack();
		stack.push(20);
		stack.push(30);
		stack.printStack();
		stack.pop();
		stack.printStack();
	}
}

