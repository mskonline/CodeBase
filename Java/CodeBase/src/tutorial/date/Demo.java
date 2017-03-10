package tutorial.date;

import java.util.Calendar;
import java.util.Date;

public class Demo {

	public static void main(String[] args) {
		setDate();
	}

	public static void setDate(){
		Calendar c = Calendar.getInstance();
		c.set(2017, 2, 8, 13, 0, 0);
		c.set(Calendar.MILLISECOND, 0);
		Date d = c.getTime();

		System.out.println(d.getTime());
		System.out.println(d);

		d = new Date(d.getTime()); // new Date((2017 - 1900), 2, 8, 13, 0, 0);
		System.out.println(d.getTime());
		System.out.println(d);
	}

}
