package constructor_Lesson;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class WorkingWithDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ZonedDateTime now = ZonedDateTime.now();
		LocalDateTime nowLDT = LocalDateTime.now();
		LocalDate localDate = LocalDate.now();
		LocalTime localTime = LocalTime.now();
		Instant instant = Instant.now();
		
		System.out.println(now);
		System.out.println(nowLDT);
		System.out.println(localDate);
		System.out.println(localTime);
		System.out.println(instant);
		System.out.println();
		
//		ZoneId.getAvailableZoneIds().forEach(System.out::println);
		
		LocalDate someDate = LocalDate.of(2021, Month.AUGUST, 9);
		
		System.out.println(someDate.minus(39, ChronoUnit.YEARS));
		
		System.out.println(someDate.isAfter(now.toLocalDate()));
		
		System.out.println(someDate.getYear());
		System.out.println(someDate.getMonth());
		System.out.println(someDate.getDayOfWeek());
	}

}
