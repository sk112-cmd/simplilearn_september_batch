package eg;

import java.util.Arrays;

public class MyStack {
	
	private static final int MAX_SIZE=3;
	private int top;
	private int arr[]=new int[MAX_SIZE];
	
	public boolean isEmpty() {
		return top<0;
	}
	public MyStack() {
		this.top=-1;
	}
	
	public boolean push(int value) {
		if(top>=MAX_SIZE-1) {
			System.out.println("Stack Overflow");
			return false;
		}else {
			arr[++top]=value;
			System.out.println(value+" pushed in stack");
			return true;
		}
	}
	
	public int pop() {
		if(top<0) {
			System.out.println("Stack is Underflow");
			return 0;
		}else {
			int x=arr[top--];
			return x;
		}
	}

	public static void main(String[] args) {
	MyStack m=new MyStack();
	m.push(100);
	m.push(2000);
	m.push(77);
	System.out.println(Arrays.toString(m.arr));
	m.push(88);
	System.out.println(m.pop());
	System.out.println(m.pop());
	System.out.println(m.pop());
	System.out.println(m.pop());

	}

}
