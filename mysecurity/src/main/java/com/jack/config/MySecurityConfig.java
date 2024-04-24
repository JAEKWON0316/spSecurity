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
	protected void configure(AuthenticationManagerBuilder auth) throws Exception { //auth�� ȸ������ �� �� ���� build login ������ �ƿ� ���ش�.
		
		/*
		auth
			.inMemoryAuthentication()
			.withUser("jack")
			.password("$2a$10$AzFLiN.DolLwlrY8kMdg/udR88P6I4Q8BhDr4fxfIq4DeGnlQSX8S")
			.roles("ADMIN");
		*/
		
		auth
			.jdbcAuthentication()  //�⺻���� db�������� ������ �ִ�. (select, ... ���)
			.dataSource(dataSource)
			.passwordEncoder(bcryptPasswordEncoder); //����Ʈ���� ��ȣȭ�� ��й�ȣ���� �־��ذ�.(DB���� �޾Ƽ� encoding �۾��� ���ش�)
		
			System.out.println("my password id crypt " + bcryptPasswordEncoder.encode("admin123"));
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
			.formLogin().loginPage("/clogin").loginProcessingUrl("/member/gallery") //Ŀ���͸���¡�� �α����������� �� �� �ְ� ��.
			.and()
			.httpBasic()
			.and()
			.logout(); 
		     /*
			.logoutUrl("/member/bye")   //�α׾ƿ��� ������ URL�� ������ �� ���
			.logoutSuccessUrl("/bye?logout")  //�α׾ƿ� �����ϸ� �����̷��� �Ǵ� URL
			.deleteCookies("JSESSIONID") //������ ��Ű�̸�
			.invalidateHttpSession(true); //���� ���� ��ȿȭ
			*/
		
	}
}
