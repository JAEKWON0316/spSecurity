package com.jack.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DefaultController {
	
	@GetMapping("/")
	public String index() {
		System.out.println("index()가 실행됨");
		return "default";
	}
	
	@ResponseBody //body에다가 직접 리턴값으로 쓸 수 있게 해줌. 
	@GetMapping("/hello")
	public String hello() {
		System.out.println("hello()가 실행됨");
		return "Hello~! Welcome to Java Wrold!! Have a Good Luck";
	}
	
	/*
	@PMapping("/bye")  //값은 bye produces(글씨 쓰기전에 헤더에 선언) UTF-8로
	public String bye() {
		System.out.println("bye()가 실행됨");
		return "redirect:/clogin";
	}
	*/
	@GetMapping("/clogin")
	public String customLogin() {
				
		return "login";
	}
	
	
}
