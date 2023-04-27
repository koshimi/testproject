package com.example.demo.member;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Data
@Alias("Data")
public class NickOrEmail {
	private String nickOrEmailOrId;
	private String data;
}
