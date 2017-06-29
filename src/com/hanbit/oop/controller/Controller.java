package com.hanbit.oop.controller;
import java.util.Scanner;

import com.hanbit.oop.service.BMIService;
import com.hanbit.oop.service.CalcService;
import com.hanbit.oop.service.GradeService;

public class Controller{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		CalcService s2=new CalcService();
		GradeService g=new GradeService();
		BMIService bs=new BMIService();
		while (true) {
			System.out.println("0.stop 1.bmi 2.grade ");
			switch (s.next()) {
			case "0":
				System.out.println("end");
				return;
			case "1":
				System.out.print("Height?\n");
				double height=s.nextDouble();
				System.out.print("Weight?\n");
				double weight=s.nextDouble();
				//String state=s2.calcBMI(height,weight);
				//System.out.print("당신은"+state+"입니다.");
				break;
			case "2":
				System.out.print("이름?\n");
				String name=s.next();
				g.setName(name);
				System.out.print("전공?\n");
				String major=s.next();
				g.setMajor(major);
				System.out.print("영어점수?\n");
				int eng=s.nextInt();
				g.setEng(eng);
				System.out.print("수학점수?\n");
				int math=s.nextInt();
				g.setMath(math);
				g.setGrade();
				System.out.println(g.toString());
				break;
			case "3":
				System.out.println("height");
				double height2 = s.nextDouble();
				System.out.println("weight");
				double weight2 = s.nextDouble();
				bs.setHeight(height2);
				bs.setWeight(weight2);
				bs.setBmi();
				bs.setState();
				
				System.out.println(bs.getState());
				break;
			}
			
		}
	}

}
		
		