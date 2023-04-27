package com.example.demo.member;

import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MemberMapper {
	public int registerUser(Member member);

	public Map<String, String> isDuplicated(NickOrEmail nickOrEmail);

	public Member login(Member member);
}
