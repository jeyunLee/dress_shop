package com.bit.dress_shop.repository;

import java.util.HashMap;
import java.util.List;

import com.bit.dress_shop.domain.Member;

public interface MemberRepository {
	public boolean addMember(Member member);
	public boolean updateMember(Member member);
	public boolean deleteMember(String id, String password);
	public Member showMember (String id);
	public Member loginMember(HashMap<String, String> login);
}