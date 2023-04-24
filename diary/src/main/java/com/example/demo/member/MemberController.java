package com.example.demo.member;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class MemberController {
	
	@GetMapping("/member/loginform")
	public String loginform(Model model) {
		model.addAttribute("registration", new MemberRegistration());
		return "/member/loginform";
	}

	
	@PostMapping("/member/login")
	public String login(MemberRegistration registration) {
		
		return "/board/menu";
	}
	

}
