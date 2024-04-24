package com.jack.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@EnableWebSecurity(debug = true)
public class MySecurityConfig extends WebSecurityConfigurerAdapter {
	
	@Autowired
	private PasswordEncoder bcryptPasswordEncoder;
	
	@Autowired
	private DataSource dataSource;
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception { //auth는 회원가입 할 떄 들어가는 build login 매핑을 아예 해준다.
		
		/*
		auth
			.inMemoryAuthentication()
			.withUser("jack")
			.password("$2a$10$AzFLiN.DolLwlrY8kMdg/udR88P6I4Q8BhDr4fxfIq4DeGnlQSX8S")
			.roles("ADMIN");
		*/
		
		auth
			.jdbcAuthentication()  //기본적인 db쿼리문을 가지고 있다. (select, ... 등등)
			.dataSource(dataSource)
			.passwordEncoder(bcryptPasswordEncoder); //사이트에서 암호화한 비밀번호값을 넣어준것.(DB에서 받아서 encoding 작업을 해준다)
		
			System.out.println("my password id crypt " + bcryptPasswordEncoder.encode("admin123"));
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
			.formLogin().loginPage("/clogin").loginProcessingUrl("/member/gallery") //커스터마이징한 로그인페이지를 쓸 수 있게 함.
			.and()
			.httpBasic()
			.and()
			.logout(); 
		     /*
			.logoutUrl("/member/bye")   //로그아웃을 수행할 URL을 지정할 떄 사용
			.logoutSuccessUrl("/bye?logout")  //로그아웃 성공하면 리다이렉션 되는 URL
			.deleteCookies("JSESSIONID") //삭제할 쿠키이름
			.invalidateHttpSession(true); //기존 세션 무효화
			*/
		
	}
}
