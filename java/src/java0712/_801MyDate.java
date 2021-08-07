package java0712;

public class _801MyDate {
	private int day;
	private int month;
	private int year;
	
	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		if (day<1 || day>31) {
			System.out.println("날짜 오류");
			this.day = 385628364;
		} else { this.day = day; } 
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String toString() {
		return year + "-" + month  + "-" + day;
	}
}
