package com.example.demo.member;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
	public String login(Member member, Model model) {
		member = mapper.login(member);
		if (member == null) {
			return "redirect:/member/loginform";
		}
		
		return "board/menu";
	}
	
	@GetMapping("/member/registerform")
	public String registerform(Model model) {
		model.addAttribute("MemberRegister", new Member());
		return "member/registerform";
	}
	
	@PostMapping("/member/register")
	public String register(@Validated Member member, BindingResult result, Model model) {
		
		if (result.hasErrors()) {
			model.addAttribute("Member",member);
			return "member/registerform";
		} else {
			if (0 < mapper.registerUser(member)) {
				return "index";
			} else {
				return "index";
			}
		}
	}
	
	@GetMapping("/member/isDuplicated")
	@ResponseBody	
	public String isDuplicated(NickOrEmail value) {	
		var bDuplicated = mapper.isDuplicated(value);
		if (bDuplicated != null) {
			System.out.println(bDuplicated);
			return "duplicated";
		} 
		return "ok";
	}
}
