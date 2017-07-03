package com.hanbit.oop.service;

import com.hanbit.oop.domain.GradeBean;

public class GradeService {
	
	public int calcTotal(GradeBean g){
		return g.getKor()+g.getEng()+g.getMath();
	}
	public int calcAvg(int total){
		return total/3;
	}
	public String getGrade(int avg){
		String grade="";
		switch(avg/10){
			case 9 :
			case 10 :
				grade=" A학점입니다. 장학금 대상입니다 !"; 
				break;
			case 8 :
				grade="B학점입니다. 3학점이수 성공!";
				break;
			case 7 :
				grade="C학점입니다. 2학점 이수 성공!"; 
				break;
			case 6 :
				grade="D학점입니다. 1학점 이수 성공!";
				break;
			case 5 :
				grade="E학점입니다. ";
			default :
				grade="학사경고 !"; 
				break;
		}
		return grade;
	}
}











