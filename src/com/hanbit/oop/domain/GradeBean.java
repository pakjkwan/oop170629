package com.hanbit.oop.domain;

public class GradeBean {
	private int kor,eng,math;
	private String name,major;
	public void setKor(int kor){
		this.kor=kor;
	}
	public void setEng(int eng){
		this.eng=eng;
	}
	public void setMath(int math){
		this.math=math;
	}
	public int getKor(){
		return kor;
	}
	public int getEng(){
		return eng;
	}
	public int getMath(){
		return math;
	}
	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return name;
	}
	public void setMajor(String major){
		this.major=major;
	}
	public String getMajor(){
		return major;
	}
	public String toString(){
		return "=============================\n"
			   +"이름    전공            성적\n"
			   +"----------------------------\n"
			   
			   +"=============================";
	}
}
