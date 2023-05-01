package com.example.demo.board;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import jakarta.servlet.http.HttpServletRequest;


@Controller
public class BoardController {
	@Autowired
	BoardMapper mapper;

	@GetMapping("/board/agora")
	public String getAgora(Model model) {
		var list = mapper.getBoardList();
		model.addAttribute("boards", list);
		return "board/agora";
	}
	@GetMapping("/board/getBoard")
	public String getAgora(Model model, int seq) {
		var list = mapper.getBoard(seq);
		model.addAttribute("board", list);
		return "board/agoraDetail";
	}
	
	@GetMapping("/board/insertBoardForm")
	public String insertBoardForm(Model model,HttpServletRequest request) {
//		var board = new Board();
//		board.setNickname((String)request.getSession().getAttribute("nickname"));
		model.addAttribute("board", new Board());
		return "board/insertBoardForm";
	}
	
	@PostMapping("/board/insertBoard")
	public String insertBoard(Board board,HttpServletRequest request) {
		board.setNickname((String)request.getSession().getAttribute("nickname"));
		System.out.println(board.getCreate_at());
		mapper.insertBoard(board);
		
		return "redirect:/board/agora";
	}
}
