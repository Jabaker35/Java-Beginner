package constructor_Lesson;

import java.time.LocalDate;
import java.util.*;

public class Practice {

	public static void main(String[] args) {
//		int age = 15;
//		String message = age >= 18 ? "Hooray... I am an adult" : "I am not an adult";
//		System.out.println(message);
		
		
		
//		String gender = "Female";
//		if (gender.equals("Female")) {
//			
//		} else if (gender.equals("Male")) {
//			
//		} else if (gender.equals("Prefer Not To Say")) {
//			
//		} else {
//			
//		}
//		
//		switch (gender) {
//		case "Female":
//			System.out.println("I am a female");
//			break;
//		case "Male":
//			System.out.println("I am a male");
//			break;
//		case "Prefer not to say":
//			System.out.println("Prefer not to say");
//			break;
//		default:
//			System.out.println("Unknown Gender");
			
			
		
		int [] numbers = {2, 0, 1, 4, 100, 4, 90, 78, 77};
//		int oneHundred = numbers[4];
//		int four = numbers[numbers.length - 1];
//		System.out.println(oneHundred);
//		System.out.println(four);
		
		
		//Loops
//		for (int i = 0; i < numbers.length; i++) {
//			System.out.println(numbers[i]);
//		}
//		
//		System.out.println("Reversal");
//		for (int i = numbers.length - 1; i >= 0; i--) {
//			System.out.println(numbers[i]);
//		}
//		
//		System.out.println("Enhanced");
//		// Doesn't have access to the index but only stores the number
//		for (int number : numbers) {
//			System.out.println(number);
//		}
//		
//		
//		String[] names = {"Anna", "Ali", "Bob", "Mike"}; {
//		for (String name : names) {
//			if (name.equals("Bob")) {
//				break;
//			}
//			System.out.println(name);
//			}
//		}
//		
//		for (String name : names) {
//			if (name.startsWith("A")) {
//				continue;
//			} System.out.println(name);
//		}
//		
//		
//		int count = 0;
//		//runs multiple of times
//		while (count <= 20) {
//			System.out.println(count);
//			count++;
//		}
//		//only runs once
//		do {
//			System.out.println(count);
//			count++;
//		} while (count <= 20);
//		
//		
//		//Scanner
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("What is your name?");
//		String userName = scanner.nextLine();
//		System.out.println("Hello " + userName);
//		
//		System.out.println("How old are you?");
//		int age = scanner.nextInt();
//		int year = LocalDate.now().minusYears(age).getYear();
//		System.out.println("You were born in " + year);
//		
//		if (age < 18) {
//			System.out.println("and you are not an adult");
//		} else {
//			System.out.println("and you are an adult ;)");
//		}		
//		
		Lens lensOne = new Lens("Sony", "85mm", true);
		Lens lensTwo = new Lens("Sony", "30mm", true);
		Lens lensThree = new Lens("Canon", "24-70mm", false);
		
		System.out.println("Lens 1");
		System.out.println(lensOne.brand);
		System.out.println(lensOne.focalLength);
		System.out.println(lensOne.isPrime);
		System.out.println();
		
		
		System.out.println("Lens 2");
		System.out.println(lensTwo.brand);
		System.out.println(lensTwo.focalLength);
		System.out.println(lensTwo.isPrime);
		System.out.println();
		
		System.out.println("Lens 3");
		System.out.println(lensThree.brand);
		System.out.println(lensThree.focalLength);
		System.out.println(lensThree.isPrime);
	}
	
	static class Lens {
		String brand;
		String focalLength;
		boolean isPrime;
		
		Lens(String brand, String focalLength, boolean isPrime) {
			this.brand = brand;
			this.focalLength = focalLength;
			this.isPrime = isPrime;
		}
	}
}
		
