package constructor_Lesson;

public class Student {
//Declare our variables
	int age;
	String name;
	String hobby;
	
	public Student(int age, String name, String hobby) {
		this.age = age;
		this.name = name;
		this.hobby = hobby;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student jonathan = new Student(38, "Jonathan", "Puzzle Games");
		System.out.println(jonathan.hobby);
	}

}
