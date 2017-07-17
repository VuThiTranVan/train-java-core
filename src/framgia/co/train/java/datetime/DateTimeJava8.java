package framgia.co.train.java.datetime;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class DateTimeJava8 {

	  public static void main(String[] args) {
		  
		  DateTimeJava8 java8tester = new DateTimeJava8();
	      java8tester.testZonedDateTime();
	   }
		
	   public void testZonedDateTime(){
		
		   //Get the current date and time
		   ZonedDateTime date1 = ZonedDateTime.parse("2017-07-10T10:15:30+05:30[Asia/Karachi]");
		   System.out.println("date1: " + date1);
		   		
		   ZoneId id = ZoneId.of("Europe/Paris");
		   System.out.println("ZoneId: " + id);
		   		
		   ZoneId currentZone = ZoneId.systemDefault();
		   System.out.println("CurrentZone: " + currentZone);
	   }

}
