package com.example.demo.member;

import java.util.Date;

import org.apache.ibatis.type.Alias;
import org.springframework.validation.annotation.Validated;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
@Alias("Member")
public class Member {
	@NotBlank(message = "id may not be null")
	private String user_id;
	@NotBlank(message = "password may not be null")
	private String user_password;
	@NotBlank(message = "email may not be null")
	private String email;
	@NotBlank(message = "nickname may not be null")
	private String nickname;
	private Date reg_date;
}
