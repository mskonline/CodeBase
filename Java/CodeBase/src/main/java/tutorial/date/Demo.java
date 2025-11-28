package tutorial.date;

import java.util.Calendar;
import java.util.Date;

public class Demo {

	public static void main(String[] args) {
		setDate();
	}

	public static void setDate(){
		// Setting a Date
		Calendar c = Calendar.getInstance();
		c.set(2017, 2, 8, 13, 0, 0);
		c.set(Calendar.MILLISECOND, 0);
		Date d = c.getTime();

		// Print in milli seconds from Jan 1, 1970
		System.out.println(d.getTime());


		// Compare two dates
		c = Calendar.getInstance();
		c.set(2017, 2, 8, 13, 0, 0);
		c.set(Calendar.MILLISECOND, 0);
		Date d2 = c.getTime();


		if(d.before(d2))
			System.out.println("Date 1 is before Date 2");
		else
			System.out.println("Date 2 is before Date 1");

	}

}
