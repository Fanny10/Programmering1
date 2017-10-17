package exercises.oop;

public class Time {
	private int hour;
	private int minute;
	private int second;

	public Time(int hour, int minute, int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}

	public int getHour() {
		return hour;

	}

	public int getMinute() {
		return minute;
	}

	public int getSecond() {
		return second;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

	public void setMinute(int minute) {
		this.minute = minute;
	}

	public void setSecond(int second) {
		this.second = second;
	}

	public void setTime(int hour, int minute, int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}

	public String toString() {
		return "Time[hour=" + this.hour + ", minute =" + this.minute + ", second=" + this.second + "]";

	}

	public Time nextSecond() {
		if (second + 1 == 60) {
			second = 0;
			minute = minute + 1;
		} else {
			second = second + 1;
		}
		if (minute == 60) {
			minute = 0;
			hour = hour + 1;
		}
		if (hour == 24) {
			hour = 0;
		}
		Time nextSec = new Time(hour, minute, second);
		return nextSec;

	}

	public Time previousSecond() {
		if (second - 1 == -1) {
			minute = minute - 1;
			second = 59;
		} else {
			second -= 1;
		}
		if(minute == -1) {
			hour = hour - 1;
			minute = 59;
		} 
		if(hour == -1) {
			hour = minute + 59; 
		}

		Time nextPre = new Time(hour, minute, second);
		return nextPre;
	}

}
