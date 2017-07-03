package com.hanbit.oop.controller;
import javax.swing.JOptionPane;

import com.hanbit.oop.domain.GradeBean;
import com.hanbit.oop.serviceImpl.GradeService;
public class GradeController{
	public static void main(String[] args) {
		GradeService service=new GradeService();
		GradeBean grade=new GradeBean();
		while (true) {
			switch (JOptionPane.showInputDialog("0.stop 1.grade")) {
			case "0":
				JOptionPane.showMessageDialog(null,"STOP!!");
				return;
			case "1":
				grade.setName(JOptionPane.showInputDialog("이름?"));
				grade.setMajor(JOptionPane.showInputDialog("전공?"));
				grade.setEng(Integer.parseInt(JOptionPane.showInputDialog("영어점수?")));
				grade.setMath(Integer.parseInt(JOptionPane.showInputDialog("수학점수?")));
				grade.setKor(Integer.parseInt(JOptionPane.showInputDialog("국어점수?")));
				JOptionPane.showMessageDialog(null,service.getGrade(service.calcAvg(service.calcTotal(grade))));
				break;
			}
			
		}
	}

}
		
		