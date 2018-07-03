package logic;

import java.time.ZonedDateTime;

public class Data {
	
	public int m;
	public int h;
	public int dd;
	public int mm;
	public int aaaa;


	public Data() {

		ZonedDateTime zdt = ZonedDateTime.now();
		
		
		m = zdt.getMinute();
		h = zdt.getHour();
		dd = zdt.getDayOfMonth();
		mm = zdt.getMonthValue();
		aaaa = zdt.getYear();		
	}

	public int getMin() {
		return m;
	}

	public int getHour() {
		return h;
	}
	
	public int getDay() {
		return dd;
	}

	public int getMonth() {
		return mm;
	}

	public int getYear() {
		return aaaa;
	}

	
	
	
	
}
