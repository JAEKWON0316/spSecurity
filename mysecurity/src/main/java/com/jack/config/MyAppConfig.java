package com.jack.config;


import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration    //환경 설정(배열 배치)
@EnableWebMvc    //webmvc사용 가능
@ComponentScan("com") //com으로 시작하는 모든 패캐지를 스캔하겠다.
public class MyAppConfig {
	
	@Bean
	InternalResourceViewResolver viewResolver() {
		
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		viewResolver.setPrefix("/WEB-INF/views/");
		viewResolver.setSuffix(".jsp");
		
		return viewResolver;
		
	}
	
	//db연결 DataSource
	@Bean
	DataSource datasource() {
		DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();
		
		driverManagerDataSource.setUrl("jdbc:mysql://localhost:3306/mydb?useUnicode=true&characterEncoding=utf-8"); //여기선 amp를 안써줘도 된다.
		driverManagerDataSource.setUsername("root");
		driverManagerDataSource.setPassword("diwo0206^");
		driverManagerDataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		
		return driverManagerDataSource;
	}
	
	@Bean  //jdbctemplate 빈 등록
	public JdbcTemplate jdbcTemplate(DataSource dataSource) {
		return new JdbcTemplate(dataSource);
	}
	
	@Bean
	PasswordEncoder getPasswordEncoder() {  //passwordEncoder 빈 등록
		
		return new BCryptPasswordEncoder();
		//return NoOpPasswordEncoder.getInstance(); //패스워드를 암호화 하지 않고 사용하고 싶을 때 사용한다. 권장X
	}
	
	
}
