package com.hanbit.oop.serviceImpl;

import com.hanbit.oop.domain.MemberBean;
import com.hanbit.oop.service.AdminService;

public class AdminServiceImpl implements AdminService{
	int count;
	MemberBean member;
	MemberBean[] list;
	public AdminServiceImpl(int limit){
		count=0;
		member=new MemberBean();
		list=new MemberBean[limit];
	}
	// 생성자 처리가 이 문제의 핵심
	@Override
	public void addMember(MemberBean member) {
		list[count]=member;
		for(int i=0;i<(count+1);i++){
			System.out.println(list[i].toString());
		}
		count++;
	}

	@Override
	public MemberBean[] getMembers() {
		
		return list;
	}

	@Override
	public int countMembers() {
		return count;
	}
	@Override
	public MemberBean findById(String id) {
		member=new MemberBean();
		for(int i=0;i<list.length;i++){
			if(id.equals(list[i].getId())){
				member=list[i];
			}
		}
		return member;
	}
	@Override
	public MemberBean[] findByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
	
	
	
}
