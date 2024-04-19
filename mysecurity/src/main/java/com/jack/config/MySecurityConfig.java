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
	protected void configure(AuthenticationManagerBuilder auth) throws Exception { //auth�� ȸ������ �� �� ���� build login ������ �ƿ� ���ش�.
		
		
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
			.authorizeRequests() //���� ��û     .anyRequest() ����û
			/*
			.antMatchers("/").permitAll()  //�ϳ� �ϳ��� ���ϰڴ�(antMatchers) , ���� �������� ������
			.antMatchers("/hello").permitAll() //hello ������ ����
			.antMatchers("/bye").permitAll() //bye ������ ����
			*/
			.antMatchers("/member/**").authenticated() //member ������ ���� , /**�� ���� ��� ������ ����Ѵ�.
			.anyRequest().permitAll()   //member�� ������ �ް� �� ���� ���� ��� ����(����X)�Ѵ�.
			.and()
			.formLogin()
			.and()
			.logout();
	}
}
