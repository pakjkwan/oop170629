package com.hanbit.oop.inheritance;

public class AndroidPhone extends IPhone{
	
	public final static String BRAND="겔러시노트";
	// BRAND 갤럭시노트
	// data 를 오버라이딩 해서 카톡메시지 라고 출력시킴
	private String size,appl;
	
	public void setSize(String size){
		setPortable(true);
		this.size=size;
	}
	public String getSize(){
		return size;
	}
	public void setAppl(String appl){
		this.appl=appl;
	}
	public String getApp1(){
		return appl;
	}

	
	@Override
	public String toString(){
		
		// 스마트폰이기 때문에 이동가능한 상태로 홍길동에게 010 번호로
		// 갤럭시노트 6인치를 사용해서 안녕이라고 카톡을 전송했다
		return  String.format("%s 이기때문에 %s 상태로 %s 에게 %s 번호로 %s %s 를 사용해서 %s이라%s 했다"
				,KIND,move,name,phoneNo,
				BRAND,size,data,appl		
				);
	}
}
