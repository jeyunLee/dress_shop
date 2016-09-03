package com.bit.dress_shop.repository.mybatis.mapper;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.bit.dress_shop.domain.Member;

public interface MemberMapper {
	public boolean addMember(Member member);
	public boolean updateMember(Member member);
	public boolean deleteMember(@Param("id") String id, @Param("password") String password);
	public Member showMember(@Param("id") String id);
	public Member loginMember(HashMap<String, String> login);
}
