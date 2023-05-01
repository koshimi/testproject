package com.example.demo.board;

import java.util.Date;

import org.apache.ibatis.type.Alias;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Alias("Board")
public class Board {
	private String seq;
	private String nickname;
	private String title;
	private String content;
	private String d_flag;
	private Date create_at;
}
