package com.example.demo.member;

import java.util.Date;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Data
@Alias("Member")
public class Member {
	private int user_id;
	private String email;
	private String nickname;
	private String user_password;
	private Date reg_date;
}
