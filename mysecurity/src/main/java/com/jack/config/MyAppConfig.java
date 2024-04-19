package com.jack.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration   //환경 설정(배열 배치)
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
	

	@Bean
	PasswordEncoder getPasswordEncoder() {
		
		return new BCryptPasswordEncoder();
		//return NoOpPasswordEncoder.getInstance(); //패스워드를 암호화 하지 않고 사용하고 싶을 때 사용한다. 권장X
	}
	
	
}
