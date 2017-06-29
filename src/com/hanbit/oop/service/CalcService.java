package com.hanbit.oop.service;


public class CalcService {
	public String calcBMI(double height,double weight){
		double bmi=weight/(height*height);
		String state="";
		if(20.0>=bmi){
			state="저체중";
		}else if(20.0<bmi&&bmi<=25.0){
			state="정상";
		}else if(25.0<bmi&&bmi<=30.0){
			state="과체중";
		}else{
			state="비만";
		}
		return state;
	}
	public String calcPlus(String a,String b){return String.valueOf(Integer.parseInt(a)+Integer.parseInt(b));}
		
	
	public String calcMinus(String a,String b){
		return String.valueOf(Integer.parseInt(a)-Integer.parseInt(b));
	}
	public String calcMulti(String a,String b){
		return String.valueOf(Integer.parseInt(a)*Integer.parseInt(b));
	}
	public String calcDivid(String a,String b){
		return String.valueOf(Integer.parseInt(a)/Integer.parseInt(b));
	}
	public String calcTax(String salary){
		String result="";
		return result;
	}
	public String calcTime(String second){
		String result="";
		return result;
	}
	
	
}
