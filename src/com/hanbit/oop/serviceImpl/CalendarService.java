package com.hanbit.oop.serviceImpl;

public class CalendarService {
	private int year,month,date,day;

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getDate() {
		return date;
	}

	public void setDate(int date) {
		this.date = date;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	@Override
	public String toString() {
		return "달력 [" + year + "년 " + month + "월 " + date + "일 " + day + "요일]";
	}
	
	
	
}
