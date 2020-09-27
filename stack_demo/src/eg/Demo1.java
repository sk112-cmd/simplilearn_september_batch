package eg;

import java.util.Stack;

public class Demo1 {
	
	public static void main(String[] args) {
		
		Stack<Integer> s=new Stack<>();
		s.push(99);
		s.push(49);
		s.push(909);
		s.push(199);
		s.push(9);
		s.push(99);
		s.push(45);
		System.out.println(s);
		
		System.out.println(s.pop());
		System.out.println(s);
		System.out.println(s.pop());
		System.out.println(s);
		
		System.out.println(s.peek());
		
		
	}
}
