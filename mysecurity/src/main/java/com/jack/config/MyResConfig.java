package com.jack.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


@Configuration   //ȯ�� ����(�迭 ��ġ)
public class MyResConfig implements WebMvcConfigurer {

	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		
		//res ��û�� ���� public ������ classpath:/static/ ��� �Ʒ��� �ִ� �������ϵ��� ã�´�.
		registry.addResourceHandler("/res/**").addResourceLocations("/public/", "classpath:/static/"); 
	}
}