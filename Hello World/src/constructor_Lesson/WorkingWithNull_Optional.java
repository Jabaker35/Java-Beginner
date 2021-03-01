package constructor_Lesson;

import java.util.Optional;

public class WorkingWithNull_Optional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String brand = null;
		try {
			System.out.println(brand.toUpperCase());
		} catch (NullPointerException e) {
			System.out.println("Brand is null");
		}
		
		
		String brand1 = "amigoscode";
		if (brand1 != null) {
			System.out.println(brand1.toUpperCase());
		} else {
			System.out.println("Brand is null");
		}
		
		
		//Preferred way to handle nulls through optional
		String theBrand = Optional.ofNullable(brand1)
				.map(String::toUpperCase)
				.orElseGet(() -> {
					return "Samsung";
				});
		System.out.println(theBrand);
		
	}

}
