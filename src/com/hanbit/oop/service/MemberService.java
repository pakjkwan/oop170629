package com.hanbit.oop.service;

public class MemberService {
	private String id,password,name,ssn,age,gender,login;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return name;
	}
	public String setAge(String name,String ssn){
		char ch = ssn.charAt(7);
		
		String birth = ssn.substring(0,2);
		System.out.print("birth : "+ birth);
		int age = 0;
		
		
		if(Integer.parseInt(birth)>=17){
			age = 2017-Integer.parseInt(birth)-1900+1;
		}else{
			age = 2017-Integer.parseInt(birth)-2000+1;
		}
		
		
		String gender = "", ment="";
		switch(ch){
			case '1' : case '3' :
				gender = "남자"; 
				break;
			case '2' : case '4' :
				gender = "여자";
				break;
			case '5' : case '6' :
				gender = "외국인";
				break;
			default :
				gender = "기타";
				break;
			}
		
		ment=name+"/ "+age+"살/ "+gender;
		return ment;
	}
	public void setLogin(String id,String pw){
		String loginResult="";
		if(id.equals(this.id)&&pw.equals(password)){
			login=toString();
		}else{
			login="로그인실패...";
		}
		
	}
	public String getLogin(){
		return login;
	}
	public String toString(){
		return "WELCOME "+name+"("+gender+","+age+"세)";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
