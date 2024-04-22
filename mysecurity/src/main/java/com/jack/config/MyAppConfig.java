package com.jack.config;


import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration   //ȯ�� ����(�迭 ��ġ)
@EnableWebMvc    //webmvc��� ����
@ComponentScan("com") //com���� �����ϴ� ��� ��ĳ���� ��ĵ�ϰڴ�.
public class MyAppConfig {
	
	@Bean
	InternalResourceViewResolver viewResolver() {
		
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		viewResolver.setPrefix("/WEB-INF/views/");
		viewResolver.setSuffix(".jsp");
		
		return viewResolver;
		
	}
	
	//db���� DataSource
	@Bean
	DataSource datasource() {
		DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();
		
		driverManagerDataSource.setUrl("jdbc:mysql://localhost:3306/mydb?useUnicode=true&characterEncoding=utf-8"); //���⼱ amp�� �Ƚ��൵ �ȴ�.
		driverManagerDataSource.setUsername("root");
		driverManagerDataSource.setPassword("diwo0206^");
		driverManagerDataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		
		return driverManagerDataSource;
	}
	
	@Bean
	PasswordEncoder getPasswordEncoder() {
		
		return new BCryptPasswordEncoder();
		//return NoOpPasswordEncoder.getInstance(); //�н����带 ��ȣȭ ���� �ʰ� ����ϰ� ���� �� ����Ѵ�. ����X
	}
	
	
}
