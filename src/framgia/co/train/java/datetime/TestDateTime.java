package framgia.co.train.java.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class TestDateTime {

	public TestDateTime() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// // Code that use now() method
		// LocalDate currentDate = LocalDate.now();
		// LocalTime currentTime = LocalTime.now();
		// LocalDateTime currentDateTime = LocalDateTime.now();
		//
		// // Code that use of() method
		// LocalDate halloween1 = LocalDate.of(2015, Month.OCTOBER, 31);
		// LocalDate halloween2 = LocalDate.of(2015, 10, 31);
		// LocalTime startTime = LocalTime.of(14, 32); // minutes
		// LocalDateTime startDateTime = LocalDateTime.of(2015, 10, 31, 14, 32);
		//
		// // Code that use parse() method
		// LocalDate halloween3 = LocalDate.parse("2015-10-31");
		// LocalTime startTime4 = LocalTime.parse("02:32:45");
		// LocalDateTime startDateTime2 =
		// LocalDateTime.parse("2015-10-31T02:32:45.123456789");
		//
		// System.out.println(startTime);
		//
		//
		// LocalDateTime dateTime1 = LocalDateTime.parse("2015-02-28T15:30");

		// Change the month to July
//		LocalDate date = LocalDate.of(2017, 7, 10);
//		LocalDate newDate = date.withDayOfMonth(31);
//		LocalDate newDate1 = date.withDayOfYear(32);
//
//		// Thrown an exception due to an invalid day of month
//		LocalDateTime dateTime1 = LocalDateTime.parse("2017-07-31T15:30");
//		LocalDateTime newDateTime1 = dateTime1.withMonth(10);
//
//		System.out.println(date);
//		System.out.println(newDate);
//		System.out.println(newDate1);
//		System.out.println(dateTime1);
//		System.out.println(newDateTime1);

		DateTimeFormatter dtf = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
		LocalDate ld = LocalDate.now();
	    System.out.println("Medium Date: " + dtf.format(ld));
	}

}
