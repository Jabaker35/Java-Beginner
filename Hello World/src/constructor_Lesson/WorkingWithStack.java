package constructor_Lesson;

import java.util.*;

public class WorkingWithStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> stack = new Stack<>();
		
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		
		System.out.println(stack.peek());
		stack.pop();
		stack.pop();
		
		System.out.println(stack);
		
		//Stacks are LIFO = Last In First Out
	}

}
