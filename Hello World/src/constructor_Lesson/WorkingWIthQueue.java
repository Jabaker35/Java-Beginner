package constructor_Lesson;

import java.util.*;

public class WorkingWIthQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Person> queue = new LinkedList<>();
		queue.add(new Person("James"));
		queue.add(new Person("Jamila"));	
		queue.add(new Person("Abu"));
		System.out.println(queue);
		System.out.println(queue.peek());
		queue.poll();
		System.out.println(queue);
		queue.forEach(person -> System.out.println(person));
		
	}
	//Queue is FIFO = First In First Out
	
	static class Person {
		String name;
		Person(String name)	{
			this.name = name;
			}
		
//		@Override
//		public String toString() {
//			return "'Person{" + "name='" + name + '\' + '}';
//		}
	
	
		}

	
}
