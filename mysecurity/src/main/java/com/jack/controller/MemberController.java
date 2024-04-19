package com.jack.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/member") //member라고 돼있는것은 다 여기서 관여 (실제는 존재하지않지만 가상속에 존재하는 member폴더를 만든다.)
public class MemberController {
	
	//로그인 페이지
	@GetMapping("/home")
	public String home() {
		System.out.println("member/home 실행");
		return "home";
	}
	
	@GetMapping("/gallery")
	public String gallery() {
		System.out.println("member/gallery 실행");
		return "gallery";
	
	}
	
	@GetMapping("/bye")
	public String bye() {
		System.out.println("member/bye 실행");
		return "bye";
	}
	
}
