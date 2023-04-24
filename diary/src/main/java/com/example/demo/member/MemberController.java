package com.example.demo.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class MemberController {
	@Autowired
	MemberMapper mapper;
	
	@GetMapping("/member/loginform")
	public String loginform(Model model) {
		model.addAttribute("registration", new MemberRegistration());
		return "/member/loginform";
	}

	
	@PostMapping("/member/login")
	public String login(MemberRegistration registration) {
		
		return "/board/menu";
	}
	
	@GetMapping("/member/registerform")
	public String registerform(Model model) {
		model.addAttribute("Member", new Member());
		return "/board/registerform";
	}
	
	@PostMapping("/member/register")
	public String register(Member member) {
		mapper.registerUser(member);
		return "/board/loginform";
	}

}
