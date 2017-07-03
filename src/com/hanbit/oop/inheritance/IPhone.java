package com.hanbit.oop.inheritance;

public class IPhone extends CellPhone{
	protected String data;
	// KIND 는 스마트폰이라고 오버라이딩 ..
	public final static String BRAND="아이폰";
	public final static String KIND="스마트폰";
	public void setData(String data){
		this.data=data;
		portable=true;
	}
	public String getData(){
		return data;
	}
	@Override
	public String toString(){
		// 스마트폰이기 때문에 이동가능한 상태로 홍길동에게 010 번호로
		// 아이폰을 사용해서 안녕이라고 문자를 전송했다
		return  String.format("%s 이기때문에 %s 상태로 %s 에게 %s 번호로 %s %s 를 사용해서 %s이라 했다"
				,KIND,move,name,phoneNo,
				BRAND,
				KIND,
				data);
	}
}
