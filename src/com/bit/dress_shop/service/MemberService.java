package com.bit.dress_shop.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bit.dress_shop.domain.Member;
import com.bit.dress_shop.repository.MemberRepository;

@Service
public class MemberService {
	
	public MemberService() {
		System.out.println(" MemberService() 생성자");
	}
	
	@Autowired
	private MemberRepository memberRepository;
	
	
	public boolean addMember(Member member) {
		return memberRepository.addMember(member);
	}
	
	public boolean updateMember(Member member) {
		return memberRepository.updateMember(member);
	}
	
	public boolean deleteMember(String id, String password) {
		return memberRepository.deleteMember(id, password);
	}
	
	public Member showMember(String id) {
		return memberRepository.showMember(id);
	}
	
	public Member loginMember(HashMap<String,String> login) {
		return memberRepository.loginMember(login);
	}
}
