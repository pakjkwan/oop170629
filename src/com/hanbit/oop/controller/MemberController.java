package com.hanbit.oop.controller;

import java.util.Scanner;
import com.hanbit.oop.domain.MemberBean;
import com.hanbit.oop.service.MemberService;
import javax.swing.*;

public class MemberController {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		MemberService ms=new MemberService();
		MemberBean member=new MemberBean();
		while(true){
			switch (JOptionPane.showInputDialog("0.종료 1.회원등록 2.로그인")) {
			case "0" :
				System.out.println("System 종료...");
				return;
			case "1":
				member.setName(JOptionPane.showInputDialog("NAME"));
				member.setId(JOptionPane.showInputDialog("ID"));
				member.setPw(JOptionPane.showInputDialog("PASS"));
				member.setSsn(JOptionPane.showInputDialog("SSN"));
				JOptionPane.showMessageDialog(null, ms.join(member));
				break;
			case "2":
				member=new MemberBean();
				member.setId(JOptionPane.showInputDialog("Input id"));
				member.setPw(JOptionPane.showInputDialog("Input Pass"));
				JOptionPane.showMessageDialog(null,ms.login(member));
				break;
			}
		}
	}
}






