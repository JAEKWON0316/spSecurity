package com.jack.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


@Configuration   //환경 설정(배열 배치)
public class MyResConfig implements WebMvcConfigurer {

	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		
		//res 요청이 오면 public 폴더나 classpath:/static/ 경로 아래에 있는 정적파일들을 찾는다.
		registry.addResourceHandler("/res/**").addResourceLocations("/public/", "classpath:/static/"); 
	}
}
