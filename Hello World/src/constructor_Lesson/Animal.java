package constructor_Lesson;

public class Animal {
	//Declaring variables
	String name;
	String sound;
	
	//Constructor = Placeholder (Blueprint)
	public Animal (String name, String sound) {
		this.name = name;
		this.sound = sound;
	} //Method header = printing out the value of the object from the child below
	public void talk() {
		System.out.println(this.sound);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Stores the new variable using constructor
		//Inherits from the Parent class
		Animal cat = new Animal("Cat", "Meow");
		Animal dog = new Animal("Dog", "Woof");
		//Returns the object and method 
		cat.talk();
		dog.talk();
	}

}
