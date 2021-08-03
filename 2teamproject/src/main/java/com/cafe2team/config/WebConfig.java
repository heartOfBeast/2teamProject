package com.cafe2team.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.cafe2team.interceptor.LoginInterceptor;

@Configuration
public class WebConfig implements WebMvcConfigurer{

	private final LoginInterceptor loginInterceptor;
	
	public WebConfig(LoginInterceptor loginInterceptor){
		this.loginInterceptor = loginInterceptor;
	
	}
	
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		
		
		registry.addInterceptor(loginInterceptor)
				.addPathPatterns("/**")
				.excludePathPatterns("/")
				.excludePathPatterns("/favicon.ico")
				.excludePathPatterns("/css/**")
				.excludePathPatterns("/js/**")
				.excludePathPatterns("/fonts/**")
				.excludePathPatterns("/memberlogin")
				.excludePathPatterns("/accountsignup")
				.excludePathPatterns("/adminsignup")
				.excludePathPatterns("/findId")
				.excludePathPatterns("/shop/sample")
				.excludePathPatterns("/accountMemberIdCheck")
				.excludePathPatterns("/adminMemberIdCheck")
				.excludePathPatterns("/findPw");
		
		WebMvcConfigurer.super.addInterceptors(registry);
	}
}
