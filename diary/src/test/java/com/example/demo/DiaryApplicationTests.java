package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.board.BoardMapper;

@SpringBootTest
class DiaryApplicationTests {
	
	@Autowired
	BoardMapper mapper;
	@Test
	public void test() {
		System.out.println(mapper.getBoard(1).getCreate_at());
		System.out.println(mapper.test());
	}
	

}
