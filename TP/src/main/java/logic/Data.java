package logic;

import java.time.LocalDateTime;

public class Data {
	
	public int m;
	public int h;
	public int dd;
	public int mm;
	public int aaaa;
	
	protected LocalDateTime d;
	
	public Data() {
		m = d.getMinute();
		h = d.getHour();
		dd = d.getDayOfMonth();
		mm = d.getMonthValue();
		aaaa = d.getYear();		
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
