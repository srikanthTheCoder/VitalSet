package com.ideas2it.multipledatasource.service;

import java.util.List;

import com.ideas2it.multipledatasource.model.member.Member;

public interface IMemberService {

	void create(Member member);
	
	 List<Member> findAll();
	
}
