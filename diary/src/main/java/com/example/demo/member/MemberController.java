package com.example.demo.member;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;



@Controller
public class MemberController {
//	@Autowired
	MemberMapper mapper;
	
	public MemberController(MemberMapper mapper) {
		this.mapper = mapper;
	}
	
	@GetMapping("/member/loginform")
	public String loginform(Model model) {
		model.addAttribute("Member", new Member());
		return "member/loginform";
	}

	
	@PostMapping("/member/login")
	public String login(Member member) {
		var isMember = mapper.login(member.getUser_id());
		return "board/menu";
	}
	
	@GetMapping("/member/registerform")
	public String registerform(Model model) {
		model.addAttribute("member", new Member());
		return "member/registerform";
	}
	
	@PostMapping("/member/register")
	public String register(@Validated Member member, BindingResult result, Model model) {
		
		if (result.hasErrors()) {
			model.addAttribute("Member",member);
			return "member/registerform";
		} else {
			mapper.registerUser(member);
			return "index";
		}
	}
	
	@GetMapping("/member/isDuplicated")
	@ResponseBody
	public String isDuplicated(NickOrEmail data) {	
		var bDuplicated = mapper.isDuplicated(data).getData();
		System.out.println(bDuplicated);
		
		return "duplicated";
	}
}
