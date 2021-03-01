package constructor_Lesson;

import java.awt.Point;
import java.time.LocalDate;

public class Practice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int x = 0;
//		int y = incrementValue(x);
//		System.out.println(x);
//		System.out.println(y);
//		Point point = new Point(100, 100);
//		changePoint(point);
//		System.out.println(point);
		
//		int x = incrementNumber(0);
//		print(x);
//		
//		var now = getCurrentDate();
		
//		Person alex = new Person("alex");
//		Person bob = new Person("bob");
//		System.out.println(alex.name);
//		System.out.println(bob.name);
//		System.out.println(Person.createdPeople);
	}

	public class iPhone {
		private String model;
		private double price;
		private boolean isWaterResistant;
		
		public String getModel() {
			return model;
		}
		
		public boolean isWaterResistant() {
			return isWaterResistant;
		}
		
		public double getPrice() {
			return price;
		}
		
		public void setModel(String model) {
			this.model = model;
		}
		
		public void setPrice(double price) {
			this.price = price;
		}
		
		public void setWaterResistant(boolean isWaterResistant) {
			this.isWaterResistant = isWaterResistant;
		}
	}
	
	
//	static class Person {
//		static int createdPeople = 0;
//		String name;
//		Person(String name){
//			this.name = name;
//			createdPeople++;
//		}
//	}
	
//	private static int incrementNumber(int i) {
//		// TODO Auto-generated method stub
//		return 0;
//	}
//
//	private static incrementNumber(int value) {
//		return value + 1;
//	}
//	
//	private static void print(int value) {
//		System.out.println(value);
//	}
//	
//	private static LocalDate getCurrentDate() {
//		return LocalDate.now();
//	}
	
//	static void changePoint(Point point) {
//		point.x = 0;
//		point.y = 0;
//	}
//	
//	static int incrementValue(int value) {
//		return value + 1;
//	}
	
	
}
