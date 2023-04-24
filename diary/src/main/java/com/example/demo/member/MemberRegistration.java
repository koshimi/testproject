package com.example.demo.member;

import java.util.Date;

import org.apache.ibatis.type.Alias;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
@NoArgsConstructor
@Alias("Registration")
public class MemberRegistration {

	@NotBlank(message = "email is mandatory")
	private String email;
	@NotBlank(message = "nickname is mandatory")
	private String nickname;
	@NotBlank(message = "user_id is mandatory")
	private int user_id;
	@NotBlank(message = "user_password is mandatory")
	private String user_password;
	private Date reg_date;
	}
