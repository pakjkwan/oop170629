package com.hanbit.oop.controller;
import java.util.Scanner;
import com.hanbit.oop.service.CalcService;

public class Controller{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		CalcService s2=new CalcService();
		while (true) {
			System.out.println("0.stop 1.bmi 2.tax 3.calc 4 - ");
			switch (s.next()) {
			case "0":
				System.out.println("end");
				return;
			case "1":
				System.out.print("Height?\n");
				double height=s.nextDouble();
				System.out.print("Weight?\n");
				double weight=s.nextDouble();
				String state=s2.calcBMI(height,weight);
				System.out.print("당신은"+state+"입니다.");
				break;
			case "2":
				
				break;
			case "3":
				
				break;
			}
			
		}
	}

}
		
		