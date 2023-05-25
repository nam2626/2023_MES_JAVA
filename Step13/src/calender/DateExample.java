package calender;

import java.util.Date;

public class DateExample {

	public static void main(String[] args) {
		Date today = new Date();
		System.out.println(today);
		System.out.println(today.getTime());
		
		Date date = new Date(1);
		System.out.println(date);
		System.out.println(date.getTime());
		
	}

}
