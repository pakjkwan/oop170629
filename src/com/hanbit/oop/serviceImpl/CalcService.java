package com.hanbit.oop.serviceImpl;


public class CalcService {
	
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
