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
		System.out.println("index()�� �����");
		return "default";
	}
	
	@ResponseBody //body���ٰ� ���� ���ϰ����� �� �� �ְ� ����. 
	@GetMapping("/hello")
	public String hello() {
		System.out.println("hello()�� �����");
		return "Hello~! Welcome to Java Wrold!! Have a Good Luck";
	}
	
	/*
	@PMapping("/bye")  //���� bye produces(�۾� �������� ����� ����) UTF-8��
	public String bye() {
		System.out.println("bye()�� �����");
		return "redirect:/clogin";
	}
	*/
	@GetMapping("/clogin")
	public String customLogin() {
				
		return "login";
	}
	
	
}
