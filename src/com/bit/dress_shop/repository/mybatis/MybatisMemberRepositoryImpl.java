package com.bit.dress_shop.repository.mybatis;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bit.dress_shop.domain.Member;
import com.bit.dress_shop.repository.MemberRepository;
import com.bit.dress_shop.repository.mybatis.mapper.MemberMapper;

@Repository
public class MybatisMemberRepositoryImpl implements MemberRepository {
	
	public MybatisMemberRepositoryImpl() {
		System.out.println("MybatisMemberRepositoryImpl() 생성자");
	}
	@Autowired
	private MemberMapper memberMapper;
	
	@Override
	public boolean addMember(Member member) {
		return memberMapper.addMember(member);
	}

	@Override
	public boolean updateMember(Member member) {
		return memberMapper.updateMember(member);
	}

	@Override
	public boolean deleteMember(String id, String password) {
		return memberMapper.deleteMember(id, password);
	}

	@Override
	public Member showMember(String id) {
		return memberMapper.showMember(id);
	}

	@Override
	public Member loginMember(HashMap<String, String> login) {
		return memberMapper.loginMember(login);
	}


}
