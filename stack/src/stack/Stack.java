package stack;

public class Stack {
	private int stack[];
	int size = 0;
	int capacity = 5;
	
	public Stack(int capacity) {
		this.capacity = capacity;
		this.stack = new int[capacity];
	}
	
	// add new item to the stack, resize stack if necessary
	public void push(int addition) {
		if (size == capacity) {
			int newArray[] = new int[capacity*2];
			capacity*=2;
			for(int i = 0; i<size; i++) {
				newArray[i] = stack[i];
			}
			stack = newArray;
		}
		stack[size] = addition;
		size++;
	}
	
	public int pop() {
		int temp = stack[size-1];
		size--;
		return temp;
	}
	
	public void printStack() {
		for(int i= 0; i<size; i++) {
			System.out.println(stack[i]);
		}
	}
}
