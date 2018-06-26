package logic;

import java.time.LocalDateTime;

public class Data {
	
	public int m;
	public int h;
	public int dd;
	public int mm;
	public int aaaa;
	
	protected LocalDateTime data;
	
	public Data() {
		m = data.getMinute();
		h = data.getHour();
		dd = data.getDayOfMonth();
		mm = data.getMonthValue();
		aaaa = data.getYear();		
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
