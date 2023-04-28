package com.example.demo.board;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface BoardMapper {
	
	public Board getBoard(int seq);
//	@Select("SELECT * FROM agora")
	public List<Board> getBoardList(Board board);
	
	public int insertBoard(Board board);
	
	public int updateBoard(Board board);
	
	
}
