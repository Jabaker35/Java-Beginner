package constructor_Lesson;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class WorkingWithExceptions {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		String brand = null;
		
		/*
		try {
			System.out.println(brand.length());
		} catch (NullPointerException e) {
			System.out.println("brand was null " + e);
		}
		*/
		
		//Checked Exceptions
		try { 
			FileInputStream inputStream = new FileInputStream("src/example.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		
		//Unchecked Exceptions
		try {
			var result = 10 / 0;
			System.out.println(result);
		} catch (ArithmeticException | NullPointerException | NumberFormatException e) {
			System.out.println("cannot divide number by 0");
		} finally {
			System.out.println("cleaning up ...");
		}
		
		
		//Exception e is only used if you are unsure of what kind of exception is happening
		//You can also have unlimited number of catch but it is expensive
		//However you can group them into the catch instead of using multiple catch
		
		performDivision(1,0);
	}
	
	static double performDivision(double a, double b) {
		if (b == 0) {
			throw new MyException("cannot divide by 0");
		} 
		return a / b;
	}

	static class MyException extends RuntimeException {
		public MyException (String message) {
			super(message);
		}
	}
	
}
