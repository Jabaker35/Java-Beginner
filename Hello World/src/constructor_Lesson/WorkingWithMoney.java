package constructor_Lesson;

import java.math.BigDecimal;

public class WorkingWithMoney {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		Double numberOne = 0.02;
		Double numberTwo = 0.03;
		Double result = numberTwo - numberOne;
		System.out.println(result);
		*/
		
		BigDecimal numberOne = new BigDecimal("0.02");
		BigDecimal numberTwo = new BigDecimal("0.03");
		BigDecimal result = numberTwo.subtract(numberOne);
		System.out.println(result);
		System.out.println(numberOne.compareTo(numberTwo));		
		
		if (numberOne.compareTo(numberTwo) > 0) {
			
		}
		
		
		
	}

}
