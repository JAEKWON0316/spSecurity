package com.jack.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.PasswordEncoder;

@EnableWebSecurity(debug = true)
public class MySecurityConfig extends WebSecurityConfigurerAdapter {
	
	@Autowired
	private PasswordEncoder bcryptPasswordEncoder;
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception { //auth는 회원가입 할 떄 들어가는 build login 매핑을 아예 해준다.
		
		
		auth
			.inMemoryAuthentication()
			.withUser("jack")
			.password("$2a$10$AzFLiN.DolLwlrY8kMdg/udR88P6I4Q8BhDr4fxfIq4DeGnlQSX8S")
			.roles("ADMIN");
		
			System.out.println("my password id crypt " + bcryptPasswordEncoder.encode("1234"));
	}
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		
		http
			.authorizeRequests() //승인 요청     .anyRequest() 모든요청
			/*
			.antMatchers("/").permitAll()  //하나 하나씩 정하겠다(antMatchers) , 진입 페이지는 공개로
			.antMatchers("/hello").permitAll() //hello 페이지 공개
			.antMatchers("/bye").permitAll() //bye 페이지 공개
			*/
			.antMatchers("/member/**").authenticated() //member 폴더는 인증 , /**는 하위 모든 폴더를 얘기한다.
			.anyRequest().permitAll()   //member는 인증을 받고 그 외의 것은 모두 공개(인증X)한다.
			.and()
			.formLogin()
			.and()
			.logout();
	}
}
