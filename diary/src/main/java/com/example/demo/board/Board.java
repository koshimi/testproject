package com.example.demo.board;

import java.util.Date;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Data
@Alias("Board")
public class Board {
	private String seq;
	private String nickname;
	private String title;
	private String content;
	private Date create_at;
}
