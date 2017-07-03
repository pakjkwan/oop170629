package com.hanbit.oop.serviceImpl;

public class BMIService {
	private double height2, weight2, bmi;
	private String state;

	public void setHeight(double height2) {
		this.height2 = height2;
	}

	public void setWeight(double weight2) {
		this.weight2 = weight2;
	}

	public double getHeight() {
		return height2;
	}
	public double getWeight() {
		return weight2;
	}
	public void setBmi(){
		this.bmi = weight2 / (height2 * height2);
	}
	public double getBmi(){
		return bmi;
	}
	
	//double bmi = weight / (height * height);
	// String state = "";
	public void setState() {
		if (20.0 >= bmi) {
			state = "저체중";
		} else if (20.0 < bmi && bmi <= 25.0) {
			state = "정상";
		} else if (25.0 < bmi && bmi <= 30.0) {
			state = "과체중";
		} else {
			state = "비만";
		}
	}
	public String getState(){
		return state;
	}
}

