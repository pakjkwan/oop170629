package com.hanbit.oop.controller;
import javax.swing.*;

import com.hanbit.oop.inheritance.AndroidPhone;
import com.hanbit.oop.inheritance.CellPhone;
import com.hanbit.oop.inheritance.IPhone;
import com.hanbit.oop.inheritance.Phone;
public class PhoneController {
	public static void main(String[] args) {
		Phone phone=new Phone();
		CellPhone nokia=new CellPhone();
		IPhone iphone=new IPhone();
		AndroidPhone gel=new AndroidPhone();
		while (true) {
			switch (JOptionPane.showInputDialog("0.종료 1.집전화 2.휴대폰 3.아이폰")) {
			case "0":
				JOptionPane.showMessageDialog(null, "bye");
				return;

			case "1":
				phone.setName(JOptionPane.showInputDialog("Name"));
				phone.setPhoneNo(JOptionPane.showInputDialog("Phone Number"));
				phone.setBrand(JOptionPane.showInputDialog("brand"));
				phone.setCall(JOptionPane.showInputDialog("Call message"));
				JOptionPane.showMessageDialog(null,phone.toString() );
				break;
			case "2":
				nokia.setName(JOptionPane.showInputDialog("Name"));
				nokia.setPhoneNo(JOptionPane.showInputDialog("Phone Number"));
				nokia.setBrand(JOptionPane.showInputDialog("brand"));
				nokia.setPortable(true);
				nokia.setCall(JOptionPane.showInputDialog("Call message"));
				JOptionPane.showMessageDialog(null,nokia.toString() );
				break;
			case "3":
				iphone.setName(JOptionPane.showInputDialog("Name"));
				iphone.setPhoneNo(JOptionPane.showInputDialog("Phone Number"));
				iphone.setData(JOptionPane.showInputDialog("Call message"));
				JOptionPane.showMessageDialog(null,gel.toString() );
				break;
				
			case "4":
				gel.setName(JOptionPane.showInputDialog("Name"));
				gel.setPhoneNo(JOptionPane.showInputDialog("Phone Number"));
				gel.setSize(JOptionPane.showInputDialog("size"));
				gel.setAppl(JOptionPane.showInputDialog("appl"));
				gel.setData(JOptionPane.showInputDialog("Call message"));
				JOptionPane.showMessageDialog(null,gel.toString() );
				break;
			
			}	
		}
	}
}
