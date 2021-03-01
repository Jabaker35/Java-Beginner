package constructor_Lesson;

public class Car {
	int age;
	String name;
	String color;
	
	public Car(int age, String name, String color) {
		this.age = age;
		this.name = name;
		this.color = color;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car ford = new Car (2018, "Fusion Titanium", "sandy");
		System.out.println(ford.color);

	}

}
