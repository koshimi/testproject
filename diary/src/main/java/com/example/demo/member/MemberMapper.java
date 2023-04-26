package com.example.demo.member;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MemberMapper {
	public int registerUser(Member member);

	public NickOrEmail isDuplicated(NickOrEmail data);

	public boolean login(String user_id);
}
